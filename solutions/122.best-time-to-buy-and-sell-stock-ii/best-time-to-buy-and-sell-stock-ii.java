class Solution {
    public int maxProfit(int[] prices) {
	    int profit = 0;
	    int delta = 0;
	    for (int i = 1; i < prices.length; i++) {
	        delta = prices[i] - prices[i - 1];
	        if (delta > 0) {
		        profit += delta;
	        }
	    }
	    return profit;
    }
}