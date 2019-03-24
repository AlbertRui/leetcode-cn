class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int width = obstacleGrid[0].length;
        int[] dp = new int[width + 1];
        dp[1] = 1;
        for(int[] row : obstacleGrid) 
            for(int i = 1; i <= width; i++) 
                if(row[i - 1] == 0) 
                    dp[i] += dp[i - 1];
                else dp[i] = 0;
        return dp[width];
    }
}