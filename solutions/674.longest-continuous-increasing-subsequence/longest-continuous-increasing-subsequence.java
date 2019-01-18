class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int curRes = 1, res = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) curRes++;
            else {
                res = Math.max(res, curRes);
                curRes = 1;
            }
        } 
        return Math.max(res, curRes);
    }
}