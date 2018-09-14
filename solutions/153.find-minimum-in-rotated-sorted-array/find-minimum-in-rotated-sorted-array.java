class Solution {
    public int findMin(int[] nums) {
        int count = nums.length - 1;
        if(nums[count] > nums[0]) return nums[0];
        while(count > 0 && nums[count] > nums[count - 1]) count --;
        return nums[count];
    }
}