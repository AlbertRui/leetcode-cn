class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // int[] dp = new int[cost.length + 1];
        // for(int i = 2; i < dp.length; i++) 
        //     dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        // return dp[cost.length];
        for(int i = 2; i < cost.length; i++) 
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}