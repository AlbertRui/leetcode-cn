class Solution {
public:
    int minFlipsMonoIncr(string S) {
        int ans, n = S.size();
        vector<int> left(n);
        vector<int> right(n + 1);
        left[0] = S[0] - '0';
        right[n - 1] = '1' - S[n - 1];
        for(int i = 1; i < n; i++) 
            left[i] = left[i - 1] + S[i] - '0';
        for(int i = n - 1; i > 0; i--) 
            right[i - 1] = right[i] + '1' - S[i - 1];
        ans = min(left[n - 1], right[0]); 
        for(int i = 1; i < n; i++)
            ans = min(ans, left[i - 1] + right[i]);
        return ans;
    }
};