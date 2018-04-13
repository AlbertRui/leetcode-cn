class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> list;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int sum, begin = i + 1, end = nums.length - 1;
            while (begin < end) {
                sum = nums[i] + nums[begin] + nums[end];
                if (sum == 0) {
                    list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[begin]);
                    list.add(nums[end]);
                    result.add(list);
                    begin++;
                    end--;
                    while (begin < end && nums[begin] == nums[begin - 1]) begin++;
                    while (begin < end && nums[end] == nums[end + 1]) end--;
                } else if (sum > 0) {
                    end--;
                } else {
                    begin++;
                }
            }
        }
        return result;
    }
}