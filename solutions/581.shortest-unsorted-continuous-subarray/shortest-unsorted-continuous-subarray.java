class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length, start = -1, end = -2;
        int max = nums[0], min = nums[n - 1];
        for(int i = 1; i < n; i++) {
            if(max > nums[i]) end = i;
            else max = nums[i];
            if(min < nums[n - i - 1]) start = n - i - 1;
            else min = nums[n - i - 1];
        }
        return end - start + 1;
    }
}