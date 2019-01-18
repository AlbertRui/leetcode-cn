class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if(buckets <= 1) return 0;
        int k = minutesToTest / minutesToDie + 1;
        int x = 1;
        while(x <= buckets) {
            if(Math.pow(k, x) >= buckets) 
                return x;
            x++;
        }
        return -1;
    }
}