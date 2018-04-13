class Solution {
    public int reverse(int x) {
        int digit;
        long rnum = 0;
        int n = x;

        while (n != 0) {
            digit = n % 10;
            rnum = rnum * 10 + digit;
            n = n / 10;

            // Checking the overflow
            if ((rnum > Integer.MAX_VALUE) || (rnum < Integer.MIN_VALUE))
                return 0;
        }
        return (int) rnum;
    }
}