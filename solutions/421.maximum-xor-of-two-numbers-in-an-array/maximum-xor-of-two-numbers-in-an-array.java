class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            for(int num : nums) set.add(num & mask);
            int temp = max | (1 << i);
            for(int pre : set) {
                if(set.contains(pre ^ temp)) {
                    max = temp;
                    break;
                }
            }
            set.clear();
        }
        return max;
    }
}