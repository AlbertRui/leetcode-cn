class Solution {
    
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        return count(A, R) - count(A, L - 1);
    }
    
    private int count(int[] A, int N) {
        int res = 0, cur = 0;
        for(int num : A) 
            if(num <= N) res += ++cur;
            else cur = 0;
        return res;
    }
        
}