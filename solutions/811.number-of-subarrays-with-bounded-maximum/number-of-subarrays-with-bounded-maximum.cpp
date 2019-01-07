class Solution {
public:
    int numSubarrayBoundedMax(vector<int>& A, int L, int R) {
        int ans = 0;
        int left = -1;
        int right = -1;
        for (int i = 0; i < A.size(); ++i) {
          if (A[i] >= L) right = i;
          if (A[i] > R) left = i;      
          ans += (right - left);
        }
        return ans;
    }
};