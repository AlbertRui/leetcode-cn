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
    bool isSubtree(TreeNode* s, TreeNode* t) {
        if(!s) return false;
        if(isSame(s, t)) return true;
        return isSubtree(s -> left, t) || isSubtree(s -> right, t);
    }
private:
    bool isSame(TreeNode* s, TreeNode* t) {
        if(s) {
            if(!t) return false;
            if(s -> val == t -> val) 
                return isSame(s -> left, t -> left) && isSame(s -> right, t -> right);
            return false;
        } else if(t) return false;
        return true;
    }
};