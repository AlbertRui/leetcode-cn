class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) sum += nums[i];
        double maxAverage = (double)sum / k;
        for(int i = k; i < nums.size(); i++) {
            sum -= nums[i - k];
            sum += nums[i];
            double average = (double)sum / k;
            if(average > maxAverage) maxAverage = average;
        }
        return maxAverage;
    }
};