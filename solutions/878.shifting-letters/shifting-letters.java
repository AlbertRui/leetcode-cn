class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        StringBuilder res = new StringBuilder(S);
        int shift = 0, n = shifts.length; 
        for(int i = n - 1; i >= 0; i--) {
            shift += shifts[i];
            shift %= 26;
            res.setCharAt(i, (char)((S.charAt(i) - 'a' + shift) % 26 + 'a'));
        }
        return res.toString();
    }
}