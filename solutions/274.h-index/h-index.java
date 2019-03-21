class Solution {
    public int hIndex(int[] citations) {
        // int n = citations.length;
        // int[] buckets = new int[n + 1];
        // for(int citation : citations) {
        //     if(citation >= n) buckets[n]++;
        //     else buckets[citation]++;
        // }
        // int count = 0;
        // for(int i = n; i >= 0; i--) {
        //     count += buckets[i];
        //     if(count >= i) return i;
        // }
        // return 0;
        Arrays.sort(citations);
        int len = citations.length;
        for(int i = 0; i < len; i++)
            if(citations[i] >= len - i) return len - i;
        return 0;
    }
}