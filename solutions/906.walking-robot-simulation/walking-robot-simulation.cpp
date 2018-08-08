class Solution {
public:
    int robotSim(vector<int>& commands, vector<vector<int>>& obstacles) {
        unordered_set<string> oSet; //存储障碍物坐标
        for(auto o : obstacles) {
            oSet.insert(to_string(o[0]) + "," + to_string(o[1])); //注意不能直接o[0] + "," + o[1]，会出错
        }
        int dir = 0, x = 0, y = 0, res = 0;
        vector<vector<int>> dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};// 北、东、南、西
        for(auto c : commands) {
            if(c == -1) {
                dir = (dir + 1) % 4;//向右转，即顺时针转换方向
            }
            else if(c == -2) {//向左转，逆时针转换方向
                dir = (dir - 1 + 4) % 4;
            }
            else {//没遇到障碍物前往前走
                while(c-- > 0 && oSet.find(to_string(x+dirs[dir][0]) + "," + to_string(y+dirs[dir][1])) == oSet.end()) {
                    x += dirs[dir][0];
                    y += dirs[dir][1];
                }
            }
            res = max(res, x * x + y * y);//检查能否更新最大值
        }
        return res;
    }
};