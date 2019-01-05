class Solution {
public:
    int countPrimes(int n) {
        if(n < 3) return 0;
        vector<unsigned int> flag(n, 1);
        flag[0] = flag[1] = 0;
        for(int i = 2; i <= sqrt(n); i++) {
            if(!flag[i]) continue;
            for(int j = i * i; j < n; j += i) flag[j] = 0;
        }
        return accumulate(flag.begin(), flag.end(), 0);
    }
};