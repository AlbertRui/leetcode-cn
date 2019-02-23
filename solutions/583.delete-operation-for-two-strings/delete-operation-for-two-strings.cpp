class Solution {
public:
    int minDistance(string word1, string word2) {
        int len1 = word1.size(), len2 = word2.size();
        if(len1 == 0) return len2;
        if(len2 == 0) return len1;
        vector<vector<int>> dp(len1 + 1, vector<int>(len2 + 1, 0));
        //for(int i = 0; i <= len1; i++) dp[i][0] = i;
        //for(int i = 0; i <= len2; i++) dp[0][i] = i;
        for(int i = 0; i <= len1; i++) {
            for(int j = 0; j <= len2; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = max(i, j);
                    continue;
                }
                if(word1[i - 1] == word2[j - 1])
                    dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = min(min(dp[i - 1][j], dp[i][j - 1]) + 1, dp[i - 1][j - 1] + 2);
            }
        }
        return dp[len1][len2];
    }
};