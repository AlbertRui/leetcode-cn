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
    int minDepth(TreeNode* root) {
        if(!root) return 0;
        int left = minDepth(root -> left);
        int right = minDepth(root -> right);
        if(root -> left) {
            if(root -> right) return min(left, right) + 1;
            return left + 1;
        } else if(root -> right) return right + 1;
        return 1;
    }
};