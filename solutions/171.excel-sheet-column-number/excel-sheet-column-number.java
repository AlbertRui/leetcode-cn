class Solution {
    public int titleToNumber(String s) {
        int colNum = 0;
        for(char c : s.toCharArray()) 
            colNum = colNum * 26 + (c - 'A' + 1);
        return colNum;
    }
}