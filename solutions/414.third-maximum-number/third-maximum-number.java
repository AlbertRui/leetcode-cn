class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE, 
        secondMax = Long.MIN_VALUE, thirdMax = Long.MIN_VALUE;
        for(int num : nums) {
            if(num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if(num > secondMax && num < firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if(num > thirdMax && num < secondMax) {
                thirdMax = num;
            }
        }
        if(thirdMax != Long.MIN_VALUE) return (int)thirdMax;
        return (int)firstMax;
    }
}