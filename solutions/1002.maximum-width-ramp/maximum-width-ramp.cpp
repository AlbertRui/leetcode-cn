class Solution {
public:
    int maxWidthRamp(vector<int>& A) {
        vector<pair<int, int>> vec;
        int n = A.size();
        
        for (int i = 0; i < n; ++i) vec.push_back({A[i], i});
        sort(vec.begin(), vec.end());
        
        int i = 0, j = 1, res = 0;
        while (j < n)
        {
            if (vec[i].second <= vec[j].second)
            {
                res = max(res, vec[j].second - vec[i].second);
                ++j;
            }
            else ++i;
        }
        
        return res;
    }
};