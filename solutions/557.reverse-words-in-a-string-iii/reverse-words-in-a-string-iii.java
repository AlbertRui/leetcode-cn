class Solution {
    public String reverseWords(String s) {
        String[] arrStr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < arrStr.length; i++) {
            arrStr[i] = new StringBuilder(arrStr[i]).reverse().toString();
            if(i == arrStr.length - 1) result.append(arrStr[i]);
            else result.append(arrStr[i]).append(" ");
        }
        return result.toString();
    }
}