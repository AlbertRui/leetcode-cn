class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        int m = s.size();
        int n = p.size();
        vector<int> res;
        vector<int> vp(26, 0);
        vector<int> vs(26, 0);
        for(char c : p) vp[c - 'a']++;
        for(int i = 0; i < m; i++) {
            if(i >= n) --vs[s[i - n] - 'a'];
            ++vs[s[i] - 'a'];
            if(vs == vp) res.push_back(i - n + 1);
        }
        return res;
    }
};