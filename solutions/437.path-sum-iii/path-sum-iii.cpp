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
// public:
//   int pathSum(TreeNode* root, int sum) {
//     if (!root) return 0;
//     return numOfPaths(root, sum) + pathSum(root -> left, sum) + pathSum(root -> right, sum);
//   }
// private:
//   int numOfPaths(TreeNode* node, int sum) {
//     if (!node) return 0;    
//     sum -= node -> val;
//     return (sum == 0) + numOfPaths(node -> left, sum) + numOfPaths(node -> right, sum);
//   }
public:
  int pathSum(TreeNode* root, int sum) {
    ans_ = 0;
    sums_ = {{0, 1}};
    pathSum(root, 0, sum);
    return ans_;
  }
private:
  int ans_;
  unordered_map<int, int> sums_;
  void pathSum(TreeNode* root, int cur, int sum) {
    if (!root) return;
    cur += root->val;
    ans_ += sums_[cur - sum];
    ++sums_[cur];
    pathSum(root->left, cur, sum);
    pathSum(root->right, cur, sum);
    --sums_[cur];
  }
};