class Solution {
public:
    int reachNumber(int target) {
        target = std::abs(target);
        int k = sqrt(target * 2);
        if (sum(k) < target) ++k;
        int d = sum(k) - target;
        if (d % 2 == 0) return k;
        return k + 1 + (k % 2);
    }
private:
    int sum(int k) {
        return k * (k + 1) / 2;
    }
};