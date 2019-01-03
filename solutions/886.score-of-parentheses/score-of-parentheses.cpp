// class Solution {
//     int score(string s, int left, int right) {
//         if(right - left == 1) return 1;
//         int cnt = 0;
//         for(int i = left; i < right; i++) {
//             s[i] == '(' ? cnt += 1 : cnt -= 1;
//             if(cnt == 0) return score(s, left, i) + score(s, i + 1, right);
//         }
//         return 2 * score(s, left + 1, right - 1);
//     }
// public:
//     int scoreOfParentheses(string S) {
//         return score(S, 0, S.length() - 1);
//     }
// };
class Solution {
    public:
    int scoreOfParentheses(string S) {
        int d = -1, ans = 0;
        for(int i = 0; i < S.length(); i++) {
            d += S[i] == '(' ? 1 : -1;
            if(S[i] == '(' && S[i + 1] == ')') ans += 1 << d; 
        }
        return ans;
    }
};