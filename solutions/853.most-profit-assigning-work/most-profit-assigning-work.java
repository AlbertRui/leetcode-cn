class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit[] = new int[100001];
        for(int i = 0; i < difficulty.length; i++) 
            maxProfit[difficulty[i]] = Math.max(maxProfit[difficulty[i]], profit[i]);
        for(int i = 2; i < 100001; i++) 
            maxProfit[i] = Math.max(maxProfit[i], maxProfit[i - 1]);
        int ans = 0;
        for(int level : worker) ans += maxProfit[level];
        return ans;
    }
}