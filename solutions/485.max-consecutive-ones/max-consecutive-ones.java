class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
	    int sum = 0;
	    int maxSum = 0;
	    for (int num : nums) {
            if (num == 1)
		        sum += 1;
	        if (sum > maxSum)
		        maxSum = sum;
	        if (num == 0)
		        sum = 0;
	    }
	return maxSum;
    }
}