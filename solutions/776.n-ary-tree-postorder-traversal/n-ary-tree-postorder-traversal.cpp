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
    vector<int> postorder(Node* root) {
        if(!root) return {};
        vector<int> res;
        stack<Node*> nodeStack;
        nodeStack.push(root);
        while(!nodeStack.empty()) {
            const Node* node = nodeStack.top();
            nodeStack.pop();
            res.push_back(node -> val);
            for(Node* child : node -> children) nodeStack.push(child);
        }
        reverse(begin(res), end(res));
        return res;
    }
};