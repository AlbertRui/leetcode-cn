class Solution {
public:
    int maximumSwap(int num) {
        string numstr = std::to_string(num);
        int maxidx = -1; int maxdigit = -1;
        int leftidx = -1; int rightidx = -1;        
        for (int i = numstr.size() - 1; i >= 0; --i) {
            if (numstr[i] > maxdigit) {
                maxdigit = numstr[i];
                maxidx = i;
            }
            if (numstr[i] < maxdigit) {
                leftidx = i;
                rightidx = maxidx;
            }
        }
        if (leftidx == -1) return num;
        std::swap(numstr[leftidx], numstr[rightidx]);
        return std::stoi(numstr);
    }
};