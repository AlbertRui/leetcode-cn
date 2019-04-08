class Solution {
public:
    int calculate(string s) {
        istringstream in('+' + s + '+');
        int res = 0, curRes = 0, num = 0;
        char op;
        while(in >> op) {
            if(op == '+' || op == '-') {
                res += curRes;
                in >> curRes;
                curRes *= 44 - op;
            } else {
                in >> num;
                if(op == '*') curRes *= num;
                else curRes /= num;
            }
        }
        return res;
    }
};