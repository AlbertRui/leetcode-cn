class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if ("AEIOUaeiou".indexOf(chars[left]) < 0) left++;
            else if ("AEIOUaeiou".indexOf(chars[right]) < 0) right--;
            else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}