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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null, cur = root;
        int SUM = 0;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                SUM += cur.val;
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.left == null && cur.right == null && SUM == sum) return true;
            if (cur.right != null && pre != cur.right) {
                cur = cur.right;
            } else {
                pre = cur;
                stack.pop();
                SUM -= cur.val;
                cur = null;
            }
        }
        return false;
    }
}