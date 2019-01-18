class Solution {
    public int[] constructRectangle(int area) {
        int num = (int)Math.sqrt(area);
        int[] res = new int[2];
        while(num >= 1) {
            if(area % num == 0) {
                res[0] = area / num;
                res[1] = num;
                break;
            }
            num--;
        }
        return res;
    }
}