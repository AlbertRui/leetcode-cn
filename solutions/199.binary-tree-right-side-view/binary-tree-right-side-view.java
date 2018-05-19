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
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> rightmostValueAtDepth = new HashMap<>();
        int maxDepth = -1;

        /* These two stacks are always synchronized, providing an implicit
         * association values with the same offset on each stack. */
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        nodeStack.push(root);
        depthStack.push(0);

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();

            if (node != null) {
                maxDepth = Math.max(maxDepth, depth);

                /* The first node that we encounter at a particular depth contains
                 * the correct value. */
                if (!rightmostValueAtDepth.containsKey(depth))
                    rightmostValueAtDepth.put(depth, node.val);

                nodeStack.push(node.left);
                nodeStack.push(node.right);
                depthStack.push(depth + 1);
                depthStack.push(depth + 1);
            }
        }

        /* Construct the solution based on the values that we end up with at the
         * end. */
        List<Integer> rightView = new ArrayList<>();
        for (int depth = 0; depth <= maxDepth; depth++)
            rightView.add(rightmostValueAtDepth.get(depth));

        return rightView;
    }
}