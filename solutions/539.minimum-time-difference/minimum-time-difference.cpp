class Solution {
public:
    int findMinDifference(vector<string>& timePoints) {
        sort(timePoints.begin(), timePoints.end()); 
        int n = timePoints.size();
        int minDiff = INT_MAX;
        for(int i = 1; i < n; i++) 
            minDiff = min(minDiff, getDiff(timePoints[i - 1], timePoints[i]));
        return min(minDiff, 1440 - getDiff(timePoints[0], timePoints[n - 1]));
    }
private:
    int getDiff(string pre, string next) {
        int h1 = stoi(pre.substr(0, 2));
        int m1 = stoi(pre.substr(3, 2));
        int h2 = stoi(next.substr(0, 2));
        int m2 = stoi(next.substr(3, 2));
        return (h2 - h1) * 60 + m2 - m1;
    }
};