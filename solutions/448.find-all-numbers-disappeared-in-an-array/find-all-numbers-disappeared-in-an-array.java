class Solution {
   public List<Integer> findDisappearedNumbers(int[] nums) {
	List<Integer> res = new ArrayList<Integer>();
	int n = nums.length;
	for (int i = 0; i < n; i++) {
	    int currNum = Math.abs(nums[i]);
	    if (nums[currNum - 1] > 0)
		nums[currNum - 1] = -nums[currNum - 1];
	}
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] > 0)
		res.add(i + 1);
	}
	return res;
    }
}