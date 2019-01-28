class Solution {
public:
    // int minCostClimbingStairs(vector<int>& cost) {
    //     int dp1 = 0, dp2 = 0, dp = 0; 
    //     for(int i = 1; i < cost.size(); i++) {
    //         dp = min(dp1 + cost[i], dp2 + cost[i - 1]);
    //         dp2 = dp1;
    //         dp1 = dp;
    //     }
    //     return dp;
    // }
    int minCostClimbingStairs(vector<int>& cost) {
        vector<int> m(cost.size() + 1, 0);
        return dp(m, cost, cost.size());
    }
private:
    int dp(vector<int>& m, vector<int>& cost, int i) {
        if(i < 2) return 0;
        if(m[i] > 0) return m[i];
        return m[i] = min(dp(m, cost, i - 1) + cost[i - 1], dp(m, cost, i - 2) + cost[i - 2]);
    }
};