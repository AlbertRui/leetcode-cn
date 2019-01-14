class Solution {
public:
    int peakIndexInMountainArray(vector<int>& A) {
        int left = 0, right = A.size() - 1;
        int mid = (left + right) / 2;
        while(left < right) {
            if(A[mid] < A[mid + 1]) left = mid + 1;
            else right = mid;
            mid = (left + right) / 2;
        }
        return left;
    }
};