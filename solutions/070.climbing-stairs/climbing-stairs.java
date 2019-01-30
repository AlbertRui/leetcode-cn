class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int oneStep = 2, twoStep = 1, allWays = 0;
        for(int i = 2; i < n; i++) {
            allWays = oneStep + twoStep;
            twoStep = oneStep;
            oneStep = allWays;
        }
        return allWays;
    }
}