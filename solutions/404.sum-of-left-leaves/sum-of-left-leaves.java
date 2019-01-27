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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        int res = 0;
        TreeNode cur = null;
        stack.push(root);
        while(!stack.isEmpty()) {
            cur = stack.pop();
            if(cur.left != null) {
                if(cur.left.left == null && cur.left.right == null)
                    res += cur.left.val;
                else stack.push(cur.left);
            }
            if(cur.right != null) stack.push(cur.right);
        }
        return res;
    }
}