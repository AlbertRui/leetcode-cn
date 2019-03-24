class Solution {
    public boolean reorderedPowerOf2(int N) {
        long c = counter(N);
        for(int i = 0; i < 32; i++) 
            if(counter(1 << i) == c) 
                return true;
        return false;
    }
    private long counter(int n) {
        long res = 0l;
        while(n > 0) {
            res += (int)Math.pow(10, n % 10);
            n /= 10;
        }
        return res;
    }
}