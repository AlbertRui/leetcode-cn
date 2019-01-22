class Solution {
    public int[] diStringMatch(String S) {
        int n = S.length(), left = 0, right = n;
        int[] res = new int[n + 1];
        int i = 0;
        for(char c : S.toCharArray()) {
            if(c == 'I') res[i++] = left++;
            else res[i++] = right--;
        }
        res[n] = left;
        return res;
    }
}