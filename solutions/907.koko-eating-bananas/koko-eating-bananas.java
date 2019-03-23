class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int low = 1, high = getMaxPile(piles);
        while(low <= high) {
            int k = low + ((high - low) >> 1);
            if(canEatAll(piles, k, H)) 
                high = k - 1;
            else low = k + 1;
        }
        return low;
    }
    private boolean canEatAll(int[] piles, int k, int H) {
        int countHours = 0;
        for(int pile : piles) {
            countHours += pile / k;
            if(pile % k != 0) 
                countHours++;
        }
        return countHours <= H;
    }
    private int getMaxPile(int[] piles) {
        int res = Integer.MIN_VALUE;
        for(int pile : piles) 
            if(pile > res) 
                res = pile;
        return res;
    }
}