class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int begin, end, sum;
        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] > target / 4) break;
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (nums[j] > (target-nums[i]) / 3) break;
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;
                begin = j + 1;
                end = nums.length - 1;
                while (begin < end) {
                    sum = nums[i] + nums[j] + nums[begin] + nums[end];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[begin], nums[end]));
                        begin++;
                        end--;
                        while (begin < end && nums[begin] == nums[begin - 1]) begin++;
                        while (begin < end && nums[end] == nums[end + 1]) end--;
                    } else if (sum > target) {
                        end--;
                    } else {
                        begin++;
                    }
                }
            }
        }
        return result;
    }
}