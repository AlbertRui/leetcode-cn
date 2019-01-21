class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int res = 0;
        while(z > 0) {
            res += z % 2;
            z /= 2;
        }
        return res;
    }
}