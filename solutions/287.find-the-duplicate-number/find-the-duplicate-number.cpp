class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int low = 1, high = nums.size();
        int mid = 0, count = 0;
        while(low <= high) {
            mid = low + (high - low) / 2;
            count = 0;
            for(int num : nums) 
                if(num <= mid) count++;
            if(count <= mid) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
};