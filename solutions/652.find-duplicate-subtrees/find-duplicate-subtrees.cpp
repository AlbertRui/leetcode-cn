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
    vector<TreeNode*> findDuplicateSubtrees(TreeNode* root) {
        unordered_map<string, int> m;
        vector<TreeNode*> res;
        dfs(root, m, res);
        return res;
    }
private: 
    string dfs(TreeNode* node, unordered_map<string, int>& m, vector<TreeNode*>& res) {
        if(!node) return "#";
        string str = to_string(node->val) + "," 
            + dfs(node->left, m, res) + "," + dfs(node->right, m, res);
        if(++m[str] == 2) res.push_back(node);
        return str;
    }
};