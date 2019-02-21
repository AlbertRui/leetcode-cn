class Solution {
public:
    bool wordBreak(string s, vector<string>& wordDict) {
        queue<int> q({0});
        unordered_set<int> visited;
        unordered_set<string> dict;
        for(string str : wordDict) dict.insert(str);
        int n = s.size();
        while(!q.empty()) {
            int start = q.front();
            q.pop();
            if(visited.count(start)) continue;
            visited.insert(start);
            string sub;
            for(int i = start; i < n; i++) {
                if(dict.count(sub += s[i])) {
                    if(i + 1 == n) return true;
                    q.push(i + 1);
                }
            }
        }
        return false;
    }
};