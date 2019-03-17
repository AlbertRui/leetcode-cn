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
    bool isValidBST(TreeNode* root) {
        TreeNode* pre = NULL;
        return valid(root, pre);
    }
private:
    bool valid(TreeNode* node, TreeNode* &pre) {
        if(!node) return true;
        if(!valid(node->left, pre)) return false;
        if(pre && pre->val >= node->val) return false;
        pre = node;
        return valid(node->right, pre);
    }
};