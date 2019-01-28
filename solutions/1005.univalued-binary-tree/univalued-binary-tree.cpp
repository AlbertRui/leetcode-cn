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
    bool isUnivalTree(TreeNode* root) {
        if(!root) return true;
        if(root -> left && root -> left -> val != root -> val) return false;
        if(root -> right && root -> right -> val != root -> val) return false;
        return isUnivalTree(root -> left) && isUnivalTree(root -> right);
        // if(!root) return true;
        // if(root -> left) {
        //     if(root -> val != root -> left -> val) return false;
        //     if(root -> right && root -> val != root -> right -> val) return false;
        //     return isUnivalTree(root -> left) && isUnivalTree(root -> right);
        // } 
        // if(root -> right) 
        //     return root -> val == root -> right -> val && isUnivalTree(root -> right);
        // return true;
    }
};