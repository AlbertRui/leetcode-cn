class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        char[] str = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if((i / k) % 2 == 0) res.insert(i - i % k, str[i]);
            else res.append(str[i]);
        }
        return res.toString();
    }
}