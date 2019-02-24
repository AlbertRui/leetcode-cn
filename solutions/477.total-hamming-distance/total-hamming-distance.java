class Solution {
    public int totalHammingDistance(int[] nums) {
        int res = 0, n = nums.length, bitCount;
        for(int i = 0; i < 32; i++) {
            bitCount = 0;
            for(int num : nums)
                bitCount += (num >> i) & 1;
            res += bitCount * (n - bitCount);
        }
        return res;
    }
}