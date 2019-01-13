class Solution {
public:
    int rob(vector<int>& nums) {
        int rob = 0, notRob = 0;
        int preRob, preNotRob;
        for(int num : nums) {
            preRob = rob; preNotRob = notRob;
            rob = preNotRob + num;
            notRob = max(preRob, preNotRob);
        }
        return max(rob, notRob);
    }
};