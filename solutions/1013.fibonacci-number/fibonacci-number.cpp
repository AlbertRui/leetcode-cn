class Solution {
public:
    int memo[50]={0};
    int fib(int N) {
        if(N<=1)
            return N;
        else if(memo[N]==0)
            memo[N]=fib(N-1)+fib(N-2);
        return memo[N];
    }
};