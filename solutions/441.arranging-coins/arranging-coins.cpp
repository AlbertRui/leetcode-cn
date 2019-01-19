class Solution {
public:
    int arrangeCoins(int n) {
        int count = 0;
        while(n > count) n -= ++count;
        return count;
    }
};