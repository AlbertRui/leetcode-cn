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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;
        TreeNode curNode = null;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                curNode = queue.remove();
                if (curNode.left == null && curNode.right == null) return depth;
                if (curNode.left != null) queue.offer(curNode.left);
                if (curNode.right != null) queue.offer(curNode.right);
            }
            depth++;
        }
        return depth;
    }
}