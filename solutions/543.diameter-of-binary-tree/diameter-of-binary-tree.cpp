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
    int diameterOfBinaryTree(TreeNode* root) {
        int mx = 0;
        maxDepth(root, mx);
        return mx;
    }
private:
    int maxDepth(TreeNode* root, int& mx) {
        if(!root) return 0;
        int left = maxDepth(root->left, mx);
        int right = maxDepth(root->right, mx);
        mx = max(mx, left + right);
        return max(left, right) + 1;
    }
};