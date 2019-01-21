class Solution {
    public int countBinarySubstrings(String s) {
        int res = 0; int cur = 1, pre = 0;
        char[] arr = s.toCharArray();
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) cur++;
            else {
                res += Math.min(cur, pre);
                pre = cur;
                cur = 1;
            }
        }
        return res + Math.min(cur, pre);
    }
}