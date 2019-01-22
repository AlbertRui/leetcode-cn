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
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<Node> nodes = new Stack<>();
        nodes.push(root);
        Node curNode = null;
        while(!nodes.isEmpty()) {
            curNode = nodes.pop();
            res.add(curNode.val);
            for(int i = curNode.children.size() - 1; i >= 0; i--) 
                nodes.push(curNode.children.get(i));
        }
        return res;
    }
}