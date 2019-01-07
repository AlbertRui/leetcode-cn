class Solution {
public:
    vector<int> exclusiveTime(int n, vector<string>& logs) {
        vector<int> res(n, 0);
        char action[6];
        int fid, curr, prev;
        stack<int> s;
        for(string& log : logs) {
            sscanf(log.c_str(), "%d:%[a-z]:%d", &fid, action, &curr);
            if(action[0] == 's') {
                if(!s.empty()) 
                    res[s.top()] += curr - prev;
                s.push(fid);
            } else {
                res[s.top()] += ++curr - prev;
                s.pop();
            }
            prev = curr;
        }
        return res;
    }
};