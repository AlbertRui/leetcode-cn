class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int[] sdp = new int[prices.length];
        int[] bdp = new int[prices.length];
        bdp[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            sdp[i] = Math.max(sdp[i - 1], bdp[i - 1] + prices[i]);
            if (i >= 2) bdp[i] = Math.max(bdp[i - 1], sdp[i - 2] - prices[i]);
            else bdp[i] = Math.max(bdp[i - 1], -prices[i]);
        }
        return sdp[prices.length - 1];
    }
}