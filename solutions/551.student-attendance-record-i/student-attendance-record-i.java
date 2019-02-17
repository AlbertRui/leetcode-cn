class Solution {
    public boolean checkRecord(String s) {
        char[] str = s.toCharArray();
        int cntL = 0, cntA = 0;
        for(char ch : str) {
            if(ch == 'A') cntA++;
            if(ch == 'L') cntL++;
            else cntL = 0;
            if(cntA > 1 || cntL > 2) return false;
        }
        return true;
    }
}