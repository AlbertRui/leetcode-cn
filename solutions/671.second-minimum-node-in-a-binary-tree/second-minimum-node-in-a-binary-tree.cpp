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
    int findSecondMinimumValue(TreeNode* root) {
        return BFS(root);        
        //return DFS(root, root->val);
    }
private:    
    int BFS(TreeNode* root) {
        int minVal = root->val;
        int secMinVal = INT_MAX;
        bool found = false;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()) {
            TreeNode* node = q.front();
            q.pop();
            if(node -> val > minVal && node -> val < secMinVal) {
                secMinVal = node->val;
                found = true;
                continue; 
            }
            if(!node->left) continue;
            q.push(node->left);
            q.push(node->right);
        }
        return found?secMinVal:-1;
    }
    int DFS(TreeNode* root, int s1) {
        if(root->val > s1) return root->val;
        int sl = DFS(root->left, s1);
        int sr = DFS(root->right, s1);
        if(sl == -1) return sr;
        if(sr == -1) return sl;
        return min(sl, sr);
    }
};