class Solution {
    public int uniquePaths(int m, int n) {
        int steps = m + n - 2;
        if(m > n) m = n;
        long res = 1;
        for(int i = 0; i < m - 1; i++)
            res = res * (steps - i) / (i + 1); 
        return (int)res;
    }
}