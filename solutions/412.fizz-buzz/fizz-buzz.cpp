class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> res;
        int cnt3 = 3, cnt5 = 5;
        for(int i = 1; i <= n; i++) {
            if(i == cnt3) {
                if(i == cnt5) {
                    res.push_back("FizzBuzz");
                    cnt5 += 5;
                } else res.push_back("Fizz");
                cnt3 += 3;
            } else if(i == cnt5) {
                res.push_back("Buzz");
                cnt5 += 5;
            } else res.push_back(to_string(i));
        }
        return res;
    }
};