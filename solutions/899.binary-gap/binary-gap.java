class Solution {
    public int binaryGap(int N) {
        int res = 0, curRes = -32;
        while(N > 0) {
            if((N & 1) == 1) {
                res = Math.max(res, curRes);
                curRes = 0;
            }
            N >>>= 1;
            curRes++;
        }
        return res;
    }
}