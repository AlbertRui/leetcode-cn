class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int num : A) {
            if(num < min) min = num;
            if(num > max) max = num;
        }
        return Math.max(max - min - 2 * K, 0);
    }
}