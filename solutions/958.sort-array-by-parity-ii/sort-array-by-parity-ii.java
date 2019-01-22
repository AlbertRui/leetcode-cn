class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0, j = 1, n = A.length;
        while(i < n && j < n) {
            while(i < n && (A[i] & 0x1) == 0) i += 2;
            while(j < n && (A[j] & 0x1) == 1) j += 2;
            if(i < n && j < n) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }
}