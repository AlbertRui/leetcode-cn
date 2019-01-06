class Solution {
public:
    int maxProfitAssignment(vector<int>& difficulty, vector<int>& profit, vector<int>& worker) {
        const int n = difficulty.size();
        vector<pair<int, int>> jobs;
        for(int i = 0; i < n; i++) 
            jobs.emplace_back(difficulty[i], profit[i]);
        std :: sort(jobs.begin(), jobs.end());
        std :: sort(worker.begin(), worker.end());
        int ans = 0, best = 0, i = 0;
        for(int level : worker) {
            while(i < n && level >= jobs[i].first) 
                best = max(best, jobs[i++].second);
            ans += best;
        }
        return ans;
    }
};