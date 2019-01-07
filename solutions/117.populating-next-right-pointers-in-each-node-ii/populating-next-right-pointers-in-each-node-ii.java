/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        Queue<TreeLinkNode> nodes = new LinkedList<TreeLinkNode>();
        nodes.offer(root);
        while(!nodes.isEmpty()) {
            int size = nodes.size();
            TreeLinkNode curNode = null;
            for(int i = 0; i < size; i++) {
                curNode = nodes.poll();
                curNode.next = nodes.peek();
                if(curNode.left != null)
                    nodes.offer(curNode.left);
                if(curNode.right != null) 
                    nodes.offer(curNode.right);
            }
            curNode.next = null;
        } 
    }
}