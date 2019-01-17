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
    // private int res = 0;
    // public int longestUnivaluePath(TreeNode root) {
    //     if(root == null) return 0;
    //     helper(root, root.val);
    //     return res;
    // }
    // private int helper(TreeNode root, int parent) {
    //     if(root == null) return 0;
    //     int left = helper(root.left, root.val);
    //     int right = helper(root.right, root.val);
    //     res = Math.max(res, left + right);
    //     if(root.val == parent) return Math.max(left, right) + 1; 
    //     return 0;
    // }
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        int sub = Math.max(longestUnivaluePath(root.left), longestUnivaluePath(root.right));
        return Math.max(sub, helper(root.left, root.val) + helper(root.right, root.val));
    }
    private int helper(TreeNode node, int parent) {
        if(node == null || node.val != parent) return 0;
        return Math.max(helper(node.left, node.val), helper(node.right, node.val)) + 1;
    }
}