class Solution {
    bool checkStamp(int index, const string& stamp, const string& target) {
        for (int i = 0; i < stamp.size(); i++) {
            if (index + i > target.size()) return false;
            if (stamp[i] != target[index + i] && target[index + i] != '?') return false;
        }
        return true;
    }

    bool checkIsOk(const string& target) {
        for (char ch: target)
            if (ch != '?')
                return false;
        return true;
    }

public:
    vector<int> movesToStamp(string stamp, string target) {
        vector<int> ops;
        int N = target.size(), M = stamp.size();
        int cnt = 0;
        bool stamped[N - M + 1];
        memset(stamped, 0, sizeof(stamped));
        bool found, ok;
        while (cnt <= N - M) {
            found = false, ok = false;
            for (int i = 0; i <= N - M; i++)
                if (!stamped[i] && checkStamp(i, stamp, target)) {
                    for (int j = 0; j < M; j++) target[i + j] = '?';
                    stamped[i] = true;
                    ops.push_back(i);
                    cnt++;
                    found = true;
                    if (checkIsOk(target)) {
                        ok = true;
                        break;
                    }
                }
            if (ok) break;
            if (!found) break;
        }
        if (ok) {
            reverse(ops.begin(), ops.end());
            return ops;
        }
        return {};
    }
};