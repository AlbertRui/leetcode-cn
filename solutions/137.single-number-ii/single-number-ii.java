class Solution {
    // public int singleNumber(int[] nums) {
    //     //eg: 01 the ones is 1, and the twos is 0;
    //     int ones = 0, twos = 0;
    //     for(int num : nums) {
    //         ones = (ones ^ num) & ~twos;
    //         twos = (twos ^ num) & ~ones;
    //     }
    //     return ones;
    // }
    public int singleNumber(int[] nums) {
        int ones = 0, twos = -1;
        for(int num : nums) {
            ones = ones ^ num & twos;
            twos = twos ^ num & ones;
        }
        return ones;
    }
}