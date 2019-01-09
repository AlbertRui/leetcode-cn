class Solution {
    public String reverseOnlyLetters(String S) {
        // Stack<Character> letters = new Stack<>();
        // char[] arrS = S.toCharArray();
        // for(char c : arrS) 
        //     if(Character.isLetter(c))
        //         letters.push(c);
        // StringBuilder res = new StringBuilder();
        // for(char c : arrS) 
        //     if(Character.isLetter(c))
        //         res.append(letters.pop());
        //     else res.append(c); 
        // return res.toString();
        StringBuilder res = new StringBuilder();
        int j = S.length() - 1;
        for(char c : S.toCharArray()) {
            if(Character.isLetter(c)) {
                while(!Character.isLetter(S.charAt(j--)));
                res.append(S.charAt(j + 1));
            } else res.append(c);
        }
        return res.toString();
    }
}