class Solution {
public:
    int deleteAndEarn(vector<int>& nums) {
        if(nums.empty()) return 0;
        const int maxNum = *max_element(nums.begin(), nums.end());
        vector<int> values(maxNum + 1, 0); 
        for(int num : nums) values[num] += num;
        for(int i = 2; i <= maxNum; i++) 
            values[i] = max(values[i - 2] + values[i], values[i - 1]);
        return values[maxNum];
    }
};