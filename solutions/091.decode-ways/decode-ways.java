class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0) return 0;
        int[] dp = new int[s.length()];
        dp[0] = s.charAt(0) == '0'? 0 : 1;
        if(s.length() == 1) return dp[0];
        int k = s.charAt(0) > '0' && s.charAt(1) > '0'? 1:0;
        dp[1] = k + (s.charAt(0) == '1' || s.charAt(0) == '2' && s.charAt(1) <= '6' ? 1:0);
        for (int i = 2; i < dp.length; i++) {
            if(s.charAt(i)!='0'){
                dp[i] += dp[i-1];
            }
            if(s.charAt(i-1)=='1'||s.charAt(i-1)=='2'&&s.charAt(i)<='6'){
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()-1];
    }
}