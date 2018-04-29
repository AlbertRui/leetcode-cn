class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String str = s.substring(i, i + 10);
            Integer count = hash.get(str);
            if (count != null && count == 1) res.add(str);
            hash.put(str, count == null ? 1 : count + 1);
        }
        return res;
    }
}