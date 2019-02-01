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
    public int diameterOfBinaryTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Map<TreeNode, Integer> lmap = new HashMap<>(); //Keeps track of the height each node
        stack.push(root);
        lmap.put(null, 0);
        int maxL = 0;
        while(!stack.isEmpty()){
            TreeNode t = stack.pop();
            if (t != null) {
                Integer left = lmap.get(t.left);
                Integer right = lmap.get(t.right);
                if (left != null && right != null){
                    lmap.put(t, Math.max(left, right) + 1);//updates the height in lmap
                    maxL = Math.max(maxL, left + right); 
                } else {
                    stack.push(t); //save and continue if current node hasn't been visited before
                    if(t.right != null)
                        stack.push(t.right);
                    if(t.left != null)
                        stack.push(t.left);
                }
            } 
        }
        return maxL;
    }
}