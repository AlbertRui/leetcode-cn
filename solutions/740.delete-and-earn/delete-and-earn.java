class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxNum = 0;
        for(int num : nums) maxNum = Math.max(maxNum, num);
        int[] values = new int[maxNum + 1];
        for(int num : nums) values[num] += num;
        //int[][] dp = new int[maxNum + 1][2];
        //dp[0][0] = 0;
        //dp[0][1] = values[0];
        int take = values[0], skip = 0, temp = 0;
        for(int i = 1; i <= maxNum; i++) {
            //dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            temp = skip;
            skip = Math.max(skip, take);
            //dp[i][1] = dp[i - 1][0] + values[i];
            take = temp + values[i];
        }
        //return Math.max(dp[maxNum][0], dp[maxNum][1]);
        return Math.max(skip, take);
    }
}