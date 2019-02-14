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
    vector<vector<int>> levelOrder(Node* root) {
        vector<vector<int>> res;
        dfs(root, 0, res);
        return res;
    }
private:
    void dfs(Node* root, int depth, vector<vector<int>>& res) {
        if(!root) return;
        if(depth < res.size()) res[depth].push_back(root->val);
        else res.push_back({root->val});
        for(Node* child : root->children) 
            dfs(child, depth + 1, res);
    } 
};