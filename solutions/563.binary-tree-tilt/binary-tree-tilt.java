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
    Map<TreeNode, Integer> map = new HashMap<>();
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
        return findTilt(root.left) + findTilt(root.right) 
            + Math.abs(sumSubTree(root.left) - sumSubTree(root.right));
    }
    private int sumSubTree(TreeNode node) {
        if(node == null) return 0;
        if(map.containsKey(node)) return map.get(node);
        int res = node.val + sumSubTree(node.left) + sumSubTree(node.right);
        map.put(node, res);
        return res;
    }
}