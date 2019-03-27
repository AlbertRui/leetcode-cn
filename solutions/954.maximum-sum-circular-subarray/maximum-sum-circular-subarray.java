class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = -30000, minSum = 30000, curMax = 0, curMin = 0;
        for(int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(curMax, maxSum);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(curMin, minSum);
            total += a;
        }
        if(maxSum > 0) return Math.max(maxSum, total - minSum);
        return maxSum;
    }
}