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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        List<Integer> curRes = null;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode curNode = null;
        queue.offer(root);
        while(!queue.isEmpty()) {
            curRes = new ArrayList<>();
            for(int size = queue.size(); size > 0; size--) {
                curNode = queue.remove();
                curRes.add(curNode.val);
                if(curNode.left != null) queue.offer(curNode.left);
                if(curNode.right != null) queue.offer(curNode.right);
            }
            res.add(curRes);
        }
        return res;
    }
}