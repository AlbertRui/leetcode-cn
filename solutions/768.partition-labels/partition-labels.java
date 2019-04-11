class Solution {
    public List<Integer> partitionLabels(String S) {
        if(S == null || S.length() == 0) return null;
        int[] map = new int[26];
        for(int i = 0; i < S.length(); i++) 
            map[S.charAt(i) - 'a'] = i;
        List<Integer> res = new ArrayList<>();
        int start = 0, last = 0;
        for(int i = 0; i < S.length(); i++) {
            last = Math.max(last, map[S.charAt(i) - 'a']);
            if(last == i) {
                res.add(last - start + 1);
                start = i + 1;
            }
        }
        return res;
    }
}