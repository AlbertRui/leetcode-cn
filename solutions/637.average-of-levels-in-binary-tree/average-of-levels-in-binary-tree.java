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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode curNode = null;
        int size, temp;
        double sum = 0.0;
        queue.offer(root);
        while(!queue.isEmpty()) {
            size = queue.size();
            temp = size;
            while(temp-- > 0) {
                curNode = queue.remove();
                sum += curNode.val;
                if(curNode.left != null) queue.offer(curNode.left);
                if(curNode.right != null) queue.offer(curNode.right);
            }
            res.add(sum / size);
            sum = 0.0;
        }
        return res;
    }
}