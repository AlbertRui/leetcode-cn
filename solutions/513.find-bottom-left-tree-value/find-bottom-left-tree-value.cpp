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
    int res = 0, h = 0;
    int findBottomLeftValue(TreeNode* root) {
        helper(root, 1);
        return res;
    }
private:
    void helper(TreeNode* root, int depth) {
        if(!root) return;
        if(h < depth) {
            res = root->val;
            h = depth;
        }
        helper(root->left, depth + 1);
        helper(root->right, depth + 1);
    }
};