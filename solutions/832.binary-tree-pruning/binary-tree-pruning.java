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
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        Set<TreeNode> set = new HashSet<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            root = stack.pop();
            if (!set.contains(root)){
                stack.push(root);
                set.add(root);
                if (root.left != null) stack.push(root.left);
                if (root.right != null)stack.push(root.right);
            } else {
                if (root.right != null && (root.right.val == 0 && root.right.right == null && root.right.left == null)){
                    root.right = null;
                }
                if (root.left != null && (root.left.val == 0 && root.left.left == null && root.left.right == null)){
                    root.left = null;
                }
            }
        }
        return root;
    }
}