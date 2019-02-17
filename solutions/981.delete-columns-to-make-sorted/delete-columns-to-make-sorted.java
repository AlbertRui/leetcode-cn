class Solution {
    public int minDeletionSize(String[] A) {
        int len = A[0].length(), count = 0;
        for(int i = 0; i < len; i++) 
            for(int j = 1; j < A.length; j++) 
                if(A[j - 1].charAt(i) > A[j].charAt(i)) {
                    count++;
                    break;
                }
        return count;
    }
}