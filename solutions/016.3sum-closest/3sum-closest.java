class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int pFront, pBack, sum, result = 0, distance = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            pFront = i + 1;
            pBack = nums.length - 1;
            while (pFront < pBack) {
                sum = nums[i] + nums[pFront] + nums[pBack];
                if (sum == target) {
                    return sum;
                } else if (Math.abs(sum - target) < distance) {
                    distance = Math.abs(sum - target);
                    result = sum;
                }
                if (sum < target) {
                    pFront++;
                } else {
                    pBack--;
                }
            }
        }
        return result;
    }
}