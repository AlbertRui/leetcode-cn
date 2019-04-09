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
    TreeNode* subtreeWithAllDeepest(TreeNode* root) {
        return deep(root).second;
    }
private:
    pair<int, TreeNode*> deep(TreeNode* root) {
        if(!root) return {0, NULL}; 
        pair<int, TreeNode*> l = deep(root->left), r = deep(root->right);
        int d1 = l.first, d2 = r.first;
        return {max(d1, d2) + 1, d1 == d2 ? root : d1 > d2 ? l.second : r.second};
    }
};