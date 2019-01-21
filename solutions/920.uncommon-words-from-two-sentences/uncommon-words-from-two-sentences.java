class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        for(String str : (A + " " + B).split(" "))
            count.put(str, count.getOrDefault(str, 0) + 1);
        List<String> res = new ArrayList<>();
        for(String key : count.keySet())
            if(count.get(key) == 1) res.add(key);
        return res.toArray(new String[0]);
    }
}