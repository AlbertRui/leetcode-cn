class Solution {
public:
    bool reorderedPowerOf2(int N) {
        set<string> two;
        for(int i = 0; i < 32; i++) {
            string s = to_string(1LL << i);
            sort(s.begin(), s.end());
            two.insert(s);
        }
        string s = to_string(N);
        sort(s.begin(), s.end());
        return two.find(s) != two.end();
    }
};