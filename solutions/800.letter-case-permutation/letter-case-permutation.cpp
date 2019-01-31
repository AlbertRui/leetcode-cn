class Solution {
public:
    vector<string> letterCasePermutation(string S) {
        vector<string> res;
        dfs(S, 0, res);
        return res;
    }
private: 
    void dfs(string& S, int count, vector<string>& res) {
        if(S.size() == count) {
            res.push_back(S);
            return;
        }
        dfs(S, count + 1, res);
        if(isalpha(S[count])) {
            S[count] ^= (1 << 5);
            dfs(S, count + 1, res);
        }
    }
};