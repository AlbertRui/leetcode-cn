class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        int mx = amount + 1;
        vector<int> dp(amount + 1, mx);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++) 
            for(int coin : coins) 
                if(coin <= i) 
                    dp[i] = min(dp[i], dp[i - coin] + 1);
        if(dp[amount] > amount) return -1;
        return dp[amount];
    }
};