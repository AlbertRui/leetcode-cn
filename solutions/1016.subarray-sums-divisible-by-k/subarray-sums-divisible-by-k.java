class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int[] count = new int[K];
        int res = 0, prefix = 0;
        count[0] = 1;
        for(int a : A) {
            prefix = (prefix + a % K + K) % K;
            res += count[prefix]++;
        }
        return res;
    }
}