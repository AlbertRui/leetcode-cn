class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums = new TreeSet<>();
        Set<Integer> result = new TreeSet<>();
        for (int num : nums1) {
            nums.add(num);
        }
        for (int num : nums2) {
            if (nums.contains(num)) {
                result.add(num);
            }
        }
        int[] finalResult = new int[result.size()];
        int i = 0;
        for (int num : result) {
            finalResult[i++] = num;
        }
        return finalResult;
    }
}