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
    int maxDepth(Node* root) {
        if(!root) return 0;
        int mx = 0;
        for(Node* node : root -> children) 
            mx = max(mx, maxDepth(node));
        return mx + 1;
    }
};