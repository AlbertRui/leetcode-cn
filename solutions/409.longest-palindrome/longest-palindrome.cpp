class Solution {
public:
    int longestPalindrome(string s) {
        vector<int> count(128);
        int odds = 0;
        for(char c : s) 
            odds += ++count[c] & 1 ? 1 : -1;
        return s.size() - odds + (odds > 0);
    }
};