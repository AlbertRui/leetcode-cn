class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int mod, sum = 0, pre = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            sum += num;
            mod = k == 0 ? sum : sum % k;
            if (set.contains(mod))
                return true;
            set.add(pre);
            pre = mod;
        }
        return false;
    }
}