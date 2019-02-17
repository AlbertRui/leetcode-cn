class Solution {
    public boolean backspaceCompare(String S, String T) {
        return getString(S).equals(getString(T));
    }
    private String getString(String str) {
        int n = str.length();
        int count = 0; char ch = ' ';
        StringBuilder res = new StringBuilder();
        while(n-- > 0) {
            ch = str.charAt(n);
            if(ch == '#') count++;
            else {
                if(count > 0) count--;
                else res.append(ch);
            }
        } 
        return res.toString();
    }
}