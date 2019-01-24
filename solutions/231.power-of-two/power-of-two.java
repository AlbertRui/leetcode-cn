class Solution {
    public boolean isPowerOfTwo(int n) {
        //return n > 0 && Integer.bitCount(n) == 1;
        return n > 0 && (n & -n) == n;
    }
}