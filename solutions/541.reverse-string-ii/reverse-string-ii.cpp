class Solution {
public:
    string reverseStr(string s, int k) {
        int i = 0, j, temp, n = s.size();
        while(i < n) {
            j = min(i + k - 1, n - 1);
            temp = j + k + 1;
            while(i < j) swap(s[i++], s[j--]);
            i = temp;
        }
        return s;
    }
};