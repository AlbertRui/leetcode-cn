class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x + y < z) return false;
        if(x == z || y == z || x + y == z) return true;
        return z % gcd(x, y) == 0;
    }
    private int gcd(int x, int y) {
        if(x == 0) return y;
        if(y == 0) return x;
        while(x != y) {
            if(x > y) x = x - y;
            else y = y - x;
        }
        return x;
    }
}