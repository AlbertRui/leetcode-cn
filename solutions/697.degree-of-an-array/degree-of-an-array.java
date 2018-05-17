class Solution {
    public int findShortestSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{1, i, i});
            } else {
                int[] temp = map.get(nums[i]);
                temp[0]++;
                temp[2] = i;
            }
        }
        int degree = Integer.MIN_VALUE, res = Integer.MAX_VALUE;
        for (int[] values : map.values()) {
            if (values[0] > degree) {
                degree = values[0];
                res = values[2] - values[1] + 1;
            } else if (values[0] == degree) {
                res = Math.min(res, values[2] - values[1] + 1);
            }
        }
        return res;
    }
}