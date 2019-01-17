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
    int longestUnivaluePath(TreeNode* root) {
        if(root == nullptr) return 0;
        int res = 0;
        univaluePath(root, &res);
        return res;
    }
private:
    int univaluePath(TreeNode* root, int* res) {
        if(root == nullptr) return 0;
        int l = univaluePath(root -> left, res);
        int r = univaluePath(root -> right, res);
        int pl = 0; int pr = 0;
        if(root -> left && root -> val == root -> left -> val) pl = l + 1;
        if(root -> right && root -> val == root -> right -> val) pr  = r + 1;
        *res = max(*res, pl + pr);
        return max(pl, pr);
    }
};