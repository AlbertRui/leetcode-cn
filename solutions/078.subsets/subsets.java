class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), 0, res);
        return res;
    }
    private void backtrack(int[] nums, List<Integer> curRes, int start, List<List<Integer>> res) {
        res.add(new ArrayList<>(curRes));
        for(int i = start; i < nums.length; i++) {
            curRes.add(nums[i]);
            backtrack(nums, curRes, i + 1, res);
            curRes.remove(curRes.size() - 1);
        }
    }
}