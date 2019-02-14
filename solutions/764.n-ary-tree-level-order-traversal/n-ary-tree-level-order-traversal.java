/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        List<Integer> curRes = null;
        Node curNode = null;
        queue.offer(root); 
        while(!queue.isEmpty()) {
            curRes = new ArrayList<>();
            for(int size = queue.size(); size > 0; size--) {
                curNode = queue.remove();
                curRes.add(curNode.val);
                for(Node node : curNode.children) queue.offer(node);
            }
            res.add(curRes);
        }
        return res;
    }
}