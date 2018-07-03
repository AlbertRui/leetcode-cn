class Solution {
    public int maxProfit(int k, int[] prices) {
        if(k <= 0 || prices.length < 2) return 0;
        int n = prices.length;
        if(k >= n / 2) {
            int max = 0;
            for (int i = 1; i < n; i++) 
                max += Math.max(0, prices[i] - prices[i - 1]);
            return max;
        }
        int[][] buy = new int[prices.length + 1][k + 1];
        int[][] sell = new int[prices.length + 1][k + 1];
        Arrays.fill(buy[0], Integer.MIN_VALUE);
        for (int i = 1; i <= prices.length; i++) {
            for (int j = 1; j <= k; j++) {
                buy[i][j] = Math.max(buy[i - 1][j],  sell[i][j - 1] - prices[i - 1]);
                sell[i][j] = Math.max(sell[i - 1][j], buy[i][j] + prices[i - 1]);
            }
        }
        return sell[prices.length][k];
    }
}