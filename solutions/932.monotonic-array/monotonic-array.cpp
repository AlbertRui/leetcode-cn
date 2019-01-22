class Solution {
public:
    bool isMonotonic(vector<int>& A) {
        if(A.size() == 1) return true;
        int n = A.size();
        bool flag = A[n - 1] > A[0];
        for(int i = 1; i < n; i++) 
            if(A[i] != A[i - 1] && A[i] > A[i - 1] != flag) return false;
        return true;
    }
};