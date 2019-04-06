class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] uni = new int[26], temp;
        for(String b : B) {
            temp = counter(b);
            for(int i = 0; i < 26; i++) 
                uni[i] = Math.max(uni[i], temp[i]);
        }
        List<String> res = new ArrayList<>();
        for(String a : A) {
            temp = counter(a);
            int i = 0;
            while(i < 26)
                if(temp[i] < uni[i++]) break;
            if(i == 26) res.add(a);
        }
        return res;
    }
    private int[] counter(String word) {
        int[] count = new int[26];
        for(char c : word.toCharArray()) 
            count[c - 'a']++;
        return count;
    }
}