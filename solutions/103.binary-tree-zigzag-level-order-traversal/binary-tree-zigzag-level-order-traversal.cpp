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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> res;
        dfs(res, root, 0);
        return res;
    }
private:
    void dfs(vector<vector<int>>& res, TreeNode* root, int level) {
        if(!root) return;
        if(res.size() == level) 
            res.push_back(vector<int>());
        if(level % 2 == 0) res[level].push_back(root->val);
        else res[level].insert(res[level].begin(), root->val);
        dfs(res, root->left, level + 1);
        dfs(res, root->right, level + 1);
    }
};