class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int sum = 0, len = 0, line = 1;
        for(char c : S.toCharArray()) {
            len = widths[c - 'a'];
            if(sum + len > 100) {
                line++;
                sum = len;
            } else sum += len;
        }
        return new int[]{line, sum};
    }
}