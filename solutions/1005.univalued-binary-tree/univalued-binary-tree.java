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
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        return dfs(root, root.val);
    }
    private boolean dfs(TreeNode root, int v) {
        if(root == null) return true;
        if(root.val != v) return false;
        return dfs(root.left, v) && dfs(root.right, v);
    }
}