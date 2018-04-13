class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
		for (int num : nums) {
			int currNum = Math.abs(num);
			if (nums[currNum - 1] > 0) {
				nums[currNum - 1] = -nums[currNum - 1];
			} else {
				result.add(currNum);
			}
		}
		return result;
    }
}