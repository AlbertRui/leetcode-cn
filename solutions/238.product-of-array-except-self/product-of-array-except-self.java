class Solution {
    public int[] productExceptSelf(int[] nums) {
	    int product = 1;
	    int flag = 0;
	    for (int num : nums) {
	        if (num != 0)
		        product *= num;
	        else
                flag ++;
	    }
        int len = nums.length;
	    for (int i = 0; i < len; i++) {
	        if(flag == 0) {
		        nums[i] = product / nums[i];
	        }else if(flag == 1) {
		        if (nums[i] == 0) {
		            nums[i] = product;
		        } else {
		            nums[i] = 0;
		        }
	        } else {
		        nums[i] = 0;
	        }
	    }
	    return nums;
    }
}