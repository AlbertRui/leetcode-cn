class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        for(char ch : magazine.toCharArray()) map[ch - 'a']++;
        for(char ch : ransomNote.toCharArray()) 
            if(--map[ch - 'a'] < 0) return false;
        return true;
    }
}