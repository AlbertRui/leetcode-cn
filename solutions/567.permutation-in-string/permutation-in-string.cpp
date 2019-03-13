class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int len1 = s1.size(), len2 = s2.size();
        if(len1 > len2) return false;
        vector<int> S(26), V(26);
        for(int i = 0; i < len1; i++) {
            S[s1[i] - 97]++;
            V[s2[i] - 97]++;
        }
        if(S == V) return true;
        for(int i = 0; i + len1 < len2; i++) {
            V[s2[i] - 97]--;
            V[s2[len1 + i] - 97]++;
            if(S == V) return true;
        }
        return false;
    }
};