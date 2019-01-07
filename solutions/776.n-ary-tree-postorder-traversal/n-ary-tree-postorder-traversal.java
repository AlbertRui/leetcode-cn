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
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        if(root == null) return new ArrayList<Integer>();
        for(Node node : root.children) postorder(node);
        res.add(root.val);
        return res;
    }
}