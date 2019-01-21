class Solution {
    public String toGoatLatin(String S) {
        Set<Character> vowels = new HashSet<>();
        for(char c : "aieouAIEOU".toCharArray()) vowels.add(c);
        StringBuilder res = new StringBuilder();
        StringBuilder aStr = new StringBuilder();
        for(String word : S.split(" ")) {
            aStr.append('a');
            res.append(" ");
            if(vowels.contains(word.charAt(0))) res.append(word);
            else res.append(word.substring(1)).append(word.charAt(0));
            res.append("ma").append(aStr);
        }
        return res.toString().substring(1);
    }
}