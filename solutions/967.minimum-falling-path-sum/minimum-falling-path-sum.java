class Solution {
    public int minFallingPathSum(int[][] A) {
        int m = A.length, n = A[0].length;
        int[][] dp = new int[m + 2][n + 2];
        for(int i = 1; i <= m; i++) {
            dp[i][0] = dp[i][n + 1] = Integer.MAX_VALUE;
            for(int j = 1; j <= n; j++) 
                dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j + 1])) 
                + A[i - 1][j - 1];
        }
        Arrays.sort(dp[n]);
        return dp[n][0];
    }
}