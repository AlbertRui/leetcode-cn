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
    public int sumNumbers(TreeNode root) {
        if (root != null)
            dfs(root, root.val);
        return res;
    }

    private int res = 0;

    private void dfs(TreeNode root, int value) {
        if (root.left == null && root.right == null) //leaf
            res += value;
        if (root.left != null)
            dfs(root.left, value * 10 + root.left.val);
        if (root.right != null)
            dfs(root.right, value * 10 + root.right.val);
    }
}