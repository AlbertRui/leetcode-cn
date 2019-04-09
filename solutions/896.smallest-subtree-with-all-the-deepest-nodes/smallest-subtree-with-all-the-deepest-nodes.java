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
    public int depth(TreeNode root,HashMap<TreeNode,Integer> map){
        if(root == null ) return 0;
        if( map.containsKey(root) ) return map.get(root); 
        int max = Math.max(depth(root.left,map),depth(root.right,map))+1;
        map.put(root,max);   
        return max;
    }
    public TreeNode dfs(TreeNode root, HashMap<TreeNode,Integer> map){
        int left =  depth(root.left,map);
        int right = depth(root.right,map);
        if( left  == right ) return root;
        if( left > right ) return dfs(root.left,map);
        return dfs(root.right,map);
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if( root == null ) return null;
        HashMap<TreeNode,Integer> map = new HashMap<>();
        //depth(root,map);
        return dfs(root,map);
    }
}