/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<Integer, Integer> map = null;
    int maxCount = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        map = new HashMap<>();
        postOrder(root);
        List<Integer> res = new ArrayList<>();
        for(int key : map.keySet()) 
            if(map.get(key) == maxCount) res.add(key);
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++) ans[i] = res.get(i);
        return ans;
    }
    private int postOrder(TreeNode root) {
        if(root == null) return 0;
        int sum = root.val + postOrder(root.left) + postOrder(root.right);
        int count = map.getOrDefault(sum, 0) + 1;
        map.put(sum, count);
        maxCount = Math.max(count, maxCount);
        return sum;
    }
}