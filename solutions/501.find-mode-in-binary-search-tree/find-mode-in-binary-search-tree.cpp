/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<int> findMode(TreeNode* root) {
        vector<int> res;
        unordered_map<int, int> m;
        int mx = 0;
        inorder(root, m, mx);
        for(auto x : m) 
            if(x.second == mx)
                res.push_back(x.first);
        return res;
    }
private:
    void inorder(TreeNode* node, unordered_map<int, int>& m, int& mx) {
        if(!node) return;
        inorder(node -> left, m, mx); 
        mx = max(mx, ++m[node -> val]);
        inorder(node -> right, m, mx);
    }
};