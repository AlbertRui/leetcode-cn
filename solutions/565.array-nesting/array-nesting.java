class Solution {
    public int arrayNesting(int[] nums) {
	    int len = nums.length;
	    int k = 0;
	    int max = 0;
	    for (int i = 0; i < len; i++) {
	        int size = 0;
	        k = nums[i];
	        nums[i] = -1;
	        while (k >= 0) {
		        size++;
		        k = nums[k];
	        }
	        max = Integer.max(max, size);
	    }
	    return max;
    }
}