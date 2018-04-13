class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        //当x的长度为奇数时，x == revertedNumber / 10去掉中间通过的数字
        return x == revertedNumber || x == revertedNumber / 10;
    }
}