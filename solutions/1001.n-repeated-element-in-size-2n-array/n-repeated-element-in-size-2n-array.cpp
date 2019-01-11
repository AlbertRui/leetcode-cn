class Solution {
public:
    int repeatedNTimes(vector<int>& A) {
        int n = A.size();
        int i = 0, j = 0;
        while(i == j || A[i] != A[j]) {
            i = rand() % n;
            j = rand() % n;
        }
        return A[i];
    }
};