class Solution {
    // public char findTheDifference(String s, String t) {
    //     int n = s.length();
    //     char res = t.charAt(n);
    //     for(int i = 0; i < n; i++) {
    //         res ^= s.charAt(i);
    //         res ^= t.charAt(i);
    //     }
    //     return res;
    // }
    public char findTheDifference(String s, String t) {
        int charCode = t.charAt(s.length());
        for (int i = 0; i < s.length(); ++i) {
              charCode -= (int)s.charAt(i);
              charCode += (int)t.charAt(i); 
        }
        return (char)charCode;
    }
}