class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = S.length() - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            if(ch != '-') {
                if(count == K) {
                    sb.append("-").append(ch);
                    count = 0;
                } else sb.append(ch);
               count++;
            }
        }
        return sb.reverse().toString().toUpperCase(); 
    }
}