class Solution {
public:
    int maxProduct(vector<int>& nums) {
        const int n = nums.size();
        int res = INT_MIN, front = 0, back = 0;
        for(int i = 0; i < n; i++) {
            front = front ? front * nums[i] : nums[i];
            back = back ? back * nums[n - i - 1] : nums[n - i - 1];
            res = max(max(front, back), res);
        } 
        return res;
    }
};