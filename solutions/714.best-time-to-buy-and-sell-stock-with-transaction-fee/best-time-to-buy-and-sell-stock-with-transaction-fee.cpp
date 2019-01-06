class Solution {
public:
    int maxProfit(vector<int>& prices, int fee) {
        int cash = 0, hode = - prices[0];
        for(int i = 1; i < prices.size(); i++) {
            cash = max(cash, hode + prices[i] - fee);
            hode = max(hode, cash - prices[i]);
        }
        return cash;
    }
};