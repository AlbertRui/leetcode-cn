class Solution {
    public boolean isValidSerialization(String preorder) {
        int diff = 1;
        for(String node : preorder.split(",")) {
            if(--diff < 0) return false;
            if(!node.equals("#")) diff += 2;
        }
        return diff == 0;
    }
}