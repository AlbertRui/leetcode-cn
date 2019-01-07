class Solution {
public:
    int minMutation(string start, string end, vector<string>& bank) {
        queue<string> q;
        const int N = start.size();
        q.push(start);
        int res = 0;
        while (!q.empty()) {
            int size = q.size();
            for(int s = 0; s < size; s++) {
                auto cur = q.front(); q.pop();
                if(cur == end) return res;
                for(int i = 0; i < N; i++) {
                    for(char ch : {'A', 'C', 'G', 'T'}) {
                        string next = cur.substr(0, i) + ch + cur.substr(i + 1);
                        if(next == cur) continue;
                        for(auto it = bank.begin(); it < bank.end(); ++it){
                            if(*it == next) {
                                q.push(next);
                                bank.erase(it);
                                break;
                            }
                        }
                    }
                }
            }
            res++;
        }
        return -1;
    }
};