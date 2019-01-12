class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<Integer>();
        int x = 0, mod = 1;
        for(int n = left; n <= right; n++) 
            if(isSelfDivided(n)) res.add(n);
        return res;
    }
    private boolean isSelfDivided(int n) {
        int x = n, mod = 0;
        while(x > 0) {
            mod = x % 10;
            x /= 10;
            if(mod == 0 || n % mod > 0) return false;
        }
        return true;
    }
}