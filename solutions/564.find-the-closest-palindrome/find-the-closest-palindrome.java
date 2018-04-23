class Solution {
    public String nearestPalindromic(String n) {
        int order = (int) Math.pow(10, n.length() / 2);
        Long ans = Long.valueOf(n);
        Long noChange = mirror(ans);
        Long larger = mirror((ans / order) * order + order + 1);
        Long smaller = mirror((ans / order) * order - 1);
        if (noChange > ans) {
            larger = Math.min(noChange, larger);
        } else if (noChange < ans) {
            smaller = Math.max(noChange, smaller);
        }
        return String.valueOf(ans - smaller <= larger - ans ? smaller : larger);
    }

    private Long mirror(Long ans) {
        char[] a = String.valueOf(ans).toCharArray();
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            a[j--] = a[i++];
        }
        return Long.valueOf(new String(a));
    }
}