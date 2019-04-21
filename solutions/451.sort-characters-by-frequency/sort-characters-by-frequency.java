class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        List<Map.Entry<Character, Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        StringBuilder res = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : list) 
            for(int i = 0; i < entry.getValue(); i++) 
                res.append(entry.getKey());
        return res.toString();
    }
}