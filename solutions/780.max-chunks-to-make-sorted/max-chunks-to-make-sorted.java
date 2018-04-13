class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxx = 0, ans = 0;
        for (int i = 0; i < arr.length; i++) {
            maxx = Math.max(maxx, arr[i]);
            if (i == maxx) ans++;
        }
        return ans;
    }
}