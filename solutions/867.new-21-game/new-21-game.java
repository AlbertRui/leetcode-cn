class Solution {
    public double new21Game(int N, int K, int W) {
        if(K == 0 || N >= K + W) return 1.0;
        double[] dp = new double[N + 1];
        double wSum = 1.0, res = 0.0;
        dp[0] = 1.0;
        for(int i = 1; i < N + 1; i++) {
            dp[i] = wSum / W;
            if(i < K) wSum += dp[i];
            else res += dp[i];
            if(i - W >= 0) wSum -= dp[i - W];
        }
        return res;
    }
}