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
    bool isSymmetric(TreeNode* root) {
        if(!root) return true;
        TreeNode *left = root -> left;
        TreeNode *right = root -> right;
        if(!left || !right) return left == right; 
        queue<TreeNode*> q;
        q.push(left); 
        q.push(right);
        while(!q.empty()) {
            left = q.front(); 
            q.pop();
            right = q.front();
            q.pop();
            if(left -> val != right -> val) return false;
            if(left -> left) {
                if(!right -> right) return false;
                q.push(left -> left);
                q.push(right -> right);
            } else if(right -> right) return false;
            if(left -> right) {
                if(!right -> left) return false;
                q.push(left -> right);
                q.push(right -> left);
            } else if(right -> left) return false;
        }
        return true;
    }
};