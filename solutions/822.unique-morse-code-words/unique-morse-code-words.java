class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> s = new HashSet<>();
        for (String word : words) {
            StringBuilder code = new StringBuilder("");
            for (char c : word.toCharArray()) code.append(d[c - 'a']);
            s.add(code.toString());
        }
        return s.size();
    }
}