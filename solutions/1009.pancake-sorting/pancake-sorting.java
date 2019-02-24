class Solution {
    public List<Integer> pancakeSort(int[] A) {
        List<Integer> res = new ArrayList<>();
        for(int x = A.length, i; x > 0; x--) {
            for(i = 0; A[i] != x; i++);
            reverse(A, i);
            res.add(i + 1);
            reverse(A, x - 1);
            res.add(x);
        }
        return res;
    }
    private void reverse(int[] A, int k) {
        int i = 0, j = k;
        while(i < j) {
            int temp = A[i];
            A[i++] = A[j];
            A[j--] = temp;
        }
    }
}