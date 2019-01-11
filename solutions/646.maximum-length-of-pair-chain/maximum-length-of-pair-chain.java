class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int i = 0, sum = 0, curEnd= 0, n = pairs.length;
        while(i < n) {
            curEnd = pairs[i][1];
            sum++;
            while(i < n && pairs[i][0] <= curEnd) i++;
        }
        return sum;
    }
}