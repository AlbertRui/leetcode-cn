class Solution {
public:
    int addDigits(int num) {
        if(num < 10) return num;
        int curNum = 0;
        while(num > 0) {
            curNum += num % 10;
            num /= 10;
        }
        return addDigits(curNum);
    }
};