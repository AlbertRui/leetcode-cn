class Solution {
    public int maxProfit(int[] prices, int fee) {
        int minP, maxP, profit = 0, curProfit = 0;
        minP = maxP = prices[0];
        for(int i = 1; i < prices.length; i++) {
            maxP = Math.max(maxP, prices[i]);
            minP = Math.min(minP, prices[i]);
            curProfit = Math.max(curProfit, prices[i] - minP - fee);
            if(!(maxP - prices[i] < fee)) {
                profit += curProfit;
                curProfit = 0;
                minP = maxP = prices[i];
            }
        }
        return profit + curProfit;
    }
}