class Solution {
public:
    vector<string> readBinaryWatch(int num) {
        vector<string> times;
        for(int i = 0; i < 12; i++) {
            bitset<4> hours((size_t) i);
            for(int j = 0; j < 60; j++) {
                bitset<6> minutes((size_t) j);
                if(hours.count() + minutes.count() == num) 
                    times.push_back(to_string(i) + (j < 10 ? ":0" : ":") + to_string(j));
            }
        }
        return times;
    }
};