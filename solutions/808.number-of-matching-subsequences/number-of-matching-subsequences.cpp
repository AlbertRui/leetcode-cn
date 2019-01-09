class Solution {
public:
    int numMatchingSubseq(string S, vector<string>& words) {
        vector<vector<int>> pos(128);
        for(int i = 0; i < S.length(); i++) 
            pos[S[i]].push_back(i);
        int res = 0;
        for(const string& word : words) 
            res += isMatch(pos, word);
        return res;
    }
private:
    unordered_map<string, bool> m_;
    bool isMatch(const vector<vector<int>>& pos, const string& word) {
        if(m_.count(word)) return m_[word];
        int last_index = -1;
        for(const char c : word) {
            const vector<int>& p = pos[c];
            const auto it = lower_bound(p.begin(), p.end(), last_index + 1);
            if(it == p.end()) return m_[word] = false;
            last_index = *it;
        }
        return m_[word] = true;
    } 
};