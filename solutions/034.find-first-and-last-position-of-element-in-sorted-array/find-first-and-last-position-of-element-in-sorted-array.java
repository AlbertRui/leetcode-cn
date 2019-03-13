class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1, -1};
        int left = 0, right = nums.length - 1, mid = 0, idx = 0;
        while(left < right) {
            mid = left + (right - left) / 2;
            if(nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        if(nums[left] != target) return new int[]{-1, -1};
        int i = left;
        while(i + 1 < nums.length && nums[i + 1] == target) i++;
        return new int[]{left, i};
    }
}