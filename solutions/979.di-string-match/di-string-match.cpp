class Solution {
public:
    vector<int> diStringMatch(string S) {
        int left = count(S.begin(), S.end(), 'D'), right = left;
        vector<int> res = {left};
        for(char c : S) {
            if(c == 'I') res.push_back(++right);
            else res.push_back(--left);
        }
        return res;
    }
};