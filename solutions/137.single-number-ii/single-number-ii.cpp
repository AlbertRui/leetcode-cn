class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int res = 0;
        for(int i = 0; i < 32; i++) {
            int mask = 1 << i;
            int count = 0;
            for(int num : nums) 
                if(num & mask) 
                    count++;
            if(count % 3) 
                res |= mask;
        }
        return res;
    }
};