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
    public String tree2str(TreeNode t) {
        if(t == null) return "";
        StringBuilder res = new StringBuilder();
        res.append(t.val);
        if(t.left == null && t.right == null) return res.toString();
        res.append("(" + tree2str(t.left) + ")");
        if(t.right != null) 
            res.append("(" + tree2str(t.right) + ")");
        return res.toString();
    }
}