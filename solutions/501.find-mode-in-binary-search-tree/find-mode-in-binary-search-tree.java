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
    Map<Integer, Integer> map;
    int max = 0;
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];
        map = new HashMap<>();
        inorder(root);
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) == max) 
                list.add(key);
        }
        int[] res = new int[list.size()];
        int i = 0;
        for(int val : list) res[i++] = val;
        return res;
    }
    private void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        max = Math.max(max, map.get(node.val));
        inorder(node.right);
    }
}