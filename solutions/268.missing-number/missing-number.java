class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length, i = 0;
        while(i < nums.length)
            res = res ^ i ^ nums[i++];
        return res;
    }
}