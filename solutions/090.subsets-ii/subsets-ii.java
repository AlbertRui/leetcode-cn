class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backTrack(List<List<Integer>> list, List<Integer> subset, int[] nums, int start) {
        list.add(new ArrayList<>(subset));
        for (int curr = start; curr < nums.length; curr++) {
            if (curr != start && nums[curr] == nums[curr - 1]) continue;
            subset.add(nums[curr]);
            backTrack(list, subset, nums, curr + 1);
            subset.remove(subset.size() - 1);
        }
    }
}