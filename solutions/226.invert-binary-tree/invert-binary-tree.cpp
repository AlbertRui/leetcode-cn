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
    TreeNode* invertTree(TreeNode* root) {
        if(!root) return NULL;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()) {
            TreeNode *curNode = q.front();
            q.pop();
            TreeNode *left = curNode -> left;
            TreeNode *right = curNode -> right;
            curNode -> left = right;
            curNode -> right = left;
            if(left) q.push(left);
            if(right) q.push(right);
        }
        return root;
    }
};