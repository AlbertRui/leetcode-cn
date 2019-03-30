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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> curRes = null;
        TreeNode curNode = null;
        boolean reverse = false;
        while(!queue.isEmpty()) {
            curRes = new ArrayList<>();
            for(int size = queue.size(); size > 0; size--) {
                curNode = queue.remove();
                if(reverse) curRes.add(0, curNode.val);
                else curRes.add(curNode.val);
                if(curNode.left != null) queue.offer(curNode.left);
                if(curNode.right != null) queue.offer(curNode.right);
            }
            res.add(curRes);
            reverse = !reverse;
        }
        return res;
    }
}