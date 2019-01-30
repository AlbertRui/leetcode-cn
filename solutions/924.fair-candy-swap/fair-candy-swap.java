class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int i = A.length, j = B.length, dif = 0;
        Set<Integer> aSet = new HashSet<>();
        while(i > 0 || j > 0) {
            if(i > 0) {
                if(j > 0) dif += A[--i] - B[--j];
                else dif += A[--i];
                aSet.add(A[i]);
            } else if(j > 0) dif -= B[--j];
        }
        for(int num : B) 
            if(aSet.contains(dif / 2 + num)) 
                return new int[]{dif / 2 + num, num};
        return null;
    }
}