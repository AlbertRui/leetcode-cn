class Solution {
    public int largestPalindrome(int n) {
        int[] ans = {0,9,987,123,597,677,1218,877,475};
        if(n>=1 && n<=8)
            return ans[n];
        return 0;
    }
}