class NumArray {
public:
    NumArray(vector<int> nums) {
        acc.push_back(0);
        for(int num : nums) acc.push_back(acc.back() + num);
    }
    
    int sumRange(int i, int j) {
        return acc[j + 1] - acc[i];
    }
private:
    vector<int> acc;
};

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */