class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>(Arrays.asList(S));
        for(int i = 0; i < S.length(); i++) {
            for(int j = res.size() - 1; j >= 0 && Character.isLetter(S.charAt(i)); j--) {
                char[] ch = res.get(j).toCharArray();
                ch[i] ^= (1 << 5);
                res.add(String.valueOf(ch));
            }
        }
        return res;
    }
}