
class Solution {
public:
    int findCircleNum(vector<vector<int>>& M) {
        vector<int> visited(M.size(), 0);
        int res = 0;
        for(int i = 0; i < M.size(); i++) {
            if(visited[i] == 0) {
                dfs(M, visited, i);
                res++;
            }
        }
        return res;
    }
private:
    void dfs(vector<vector<int>>& M, vector<int>& visited, int i) {
        for(int j = 0; j < M.size(); j++) {
            if(M[i][j] == 1 && visited[j] == 0) {
                visited[j] = 1;
                dfs(M, visited, j);
            }
        }
    }
};