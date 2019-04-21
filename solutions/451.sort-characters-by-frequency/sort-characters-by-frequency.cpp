class Solution {
public:
    string frequencySort(string s) {
        unordered_map<char, int> freq;
        vector<string> bucket(s.size() + 1, "");
        for(char c : s) freq[c]++;
        for(auto& it: freq) {
            int n = it.second;
            char c = it.first;
            bucket[n].append(n, c);//append n 个 c
        }
        string res;
        for(int i = s.size(); i > 0; i--) 
            if(!bucket[i].empty()) 
                res.append(bucket[i]);
        return res;
    }
};