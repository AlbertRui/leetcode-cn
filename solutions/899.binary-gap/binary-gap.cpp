class Solution {
public:
    int binaryGap(int N) {
        int j = -1, res = 0;
        for(int i = 0; i < 31; i++) {
            if(N & (1 << i)) {
                if(j >= 0) 
                    res = max(res, i - j);
                j = i;
            }
        }
        return res;
    }
};