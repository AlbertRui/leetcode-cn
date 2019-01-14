class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i = 1;
        while(i < A.length) {
            if(A[i] < A[i - 1]) return i - 1;
            i++;
        }
        return 0;
    }
}