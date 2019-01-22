/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
public:
    vector<int> preorder(Node* root) {
        vector<int> res;
        preorder(root, res);
        return res;
    }
private:
    void preorder(Node* root, vector<int>& res) {
        if(!root) return;
        res.push_back(root -> val);
        for(Node* node : root -> children) preorder(node, res);
    }
};