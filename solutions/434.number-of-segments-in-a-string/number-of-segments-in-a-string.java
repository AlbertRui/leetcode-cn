class Solution {
    public int countSegments(String s) {
        int res = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != ' ' && (i == 0 || ch[i - 1] == ' '))
                res ++;
        }
        return res;
    }
}