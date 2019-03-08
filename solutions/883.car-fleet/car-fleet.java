class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> map = new TreeMap<>();
        for(int i = 0; i < position.length; i++) 
            map.put(-position[i], (double)(target - position[i]) / speed[i]);
        double cur = 0; int res = 0;
        for(double time : map.values()) {
            if(time > cur) {
                cur = time;
                res++;
            }
        }
        return res;
    }
}