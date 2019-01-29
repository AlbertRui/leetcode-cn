class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num : nums1) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                map.put(num, map.get(num) - 1);
                res.add(num);
            }
        }
        int[] result = new int[res.size()];
        int i = 0;
        for(int num : res) result[i++] = num;
        return result;
    }
}