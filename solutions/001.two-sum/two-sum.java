class Solution {
    public int[] twoSum(int[] nums, int target) {
        int k = nums.length;
        int[] answer = new int[2];
        for (int i = 0; i < k; i ++) {
            answer[0] = i;
            for (int j = i + 1; j < k; j ++) {
                if (nums[i] + nums[j] == target) {
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return null;
    }
}