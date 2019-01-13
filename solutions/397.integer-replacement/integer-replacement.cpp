class Solution {
public:
    int integerReplacement(int n) {
        return (int)longReplacement(n);
    }
private: 
    long longReplacement(long n) {
        if(n < 3) return n - 1;
        if(n % 2 == 0) return longReplacement(n / 2) + 1;
        return min(longReplacement(n - 1), longReplacement(n + 1)) + 1;
    }
};