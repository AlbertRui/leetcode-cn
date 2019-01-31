class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if(pattern.length() != words.length) return false;
        Map<Character, String> map = new HashMap<>();
        char[] pat = pattern.toCharArray();
        for(int i = 0; i < pat.length; i++) {
            if(map.containsKey(pat[i])) {
                if(map.get(pat[i]).equals(words[i]))
                    continue;
                return false;
            }
            if(map.containsValue(words[i])) return false;
            map.put(pat[i], words[i]);
        }
        return true;
    }
}