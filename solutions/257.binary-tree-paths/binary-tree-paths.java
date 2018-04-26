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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        findPaths(root, new StringBuilder(), res);
        return res;
    }

    private void findPaths(TreeNode node, StringBuilder stringBuilder, List<String> res) {
        if (node == null) return;
        int len = stringBuilder.length();
        stringBuilder.append(node.val);
        if (node.left == null && node.right == null) {
            res.add(stringBuilder.toString());
        } else {
            stringBuilder.append("->");
            findPaths(node.left, stringBuilder, res);
            findPaths(node.right, stringBuilder, res);
        }
        stringBuilder.setLength(len);
    }
}