class Solution {
    public int maxRotateFunction(int[] A) {
        int len = A.length;
        if(len == 0 || len == 1) return 0;
        int sum = 0, dp0 = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            sum += A[i];
            dp0 += i * A[i];
        }
        int dp = dp0;
        for(int i = 1; i <= len; i++) {
            dp = dp - sum + len * A[i - 1];
            max = Math.max(dp, max);
        }
        return max; 
    }
}