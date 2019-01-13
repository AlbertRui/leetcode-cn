class Solution {
    public int integerReplacement(int n) {
        if(n < 4) return n - 1;
        long N = n;
        int res = 0;
        while(N != 1) {
            if(N % 2 == 0) {
                N >>= 1;
            } else {
                if(N == 3) return res + 2;
                N = (N & 2) == 2 ? N + 1 : N - 1;
            }
            res++;
        }
        return res;
    }
}