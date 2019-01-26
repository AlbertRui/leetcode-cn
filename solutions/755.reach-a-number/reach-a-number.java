class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0, sum = 0; 
        while(sum < target) sum += ++k;
        while((sum - target) % 2 != 0) sum += ++k;
        return k;
    }
}