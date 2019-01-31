class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int i = Arrays.binarySearch(letters, (char) (target + 1));
        return letters[i >= 0 ? i : ~i % letters.length];
    }
}