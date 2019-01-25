/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        int mid = (nums.length - 1) / 2;
        MyNode myNode = new MyNode(new TreeNode(nums[mid]), 0, nums.length - 1);
        Stack<MyNode> stack = new Stack<>();
        stack.push(myNode);
        MyNode curMyNode = null;
        TreeNode curNode = null;
        int begin, end, curMid;
        while(!stack.isEmpty()) {
            curMyNode = stack.pop();
            begin = curMyNode.begin;
            end = curMyNode.end;
            mid = begin + (end - begin) / 2;
            if(begin < mid) {
                curMid = begin + (mid - begin - 1) / 2;
                curNode = new TreeNode(nums[curMid]);
                curMyNode.node.left = curNode;
                stack.push(new MyNode(curNode, begin, mid - 1));
            }
            if(mid < end) {
                curMid = mid + 1 + (end - mid - 1) / 2;
                curNode = new TreeNode(nums[curMid]);
                curMyNode.node.right = curNode;
                stack.push(new MyNode(curNode, mid + 1, end));
            } 
        }
        return myNode.node;
    }
}
class MyNode {
    TreeNode node; 
    int begin;
    int end;
    MyNode(TreeNode node, int begin, int end) {
        this.node = node;
        this.begin = begin;
        this.end = end;
    }
}