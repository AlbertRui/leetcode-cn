class Solution {
public:
    string pushDominoes(string dominoes) {
        int len = dominoes.length();
        vector<int> visit(len);
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(dominoes[j] == 'R' && j < len && dominoes[j + 1] == '.') 
                    visit[j + 1] += 1;
                if(dominoes[j] == 'L' && j > 0 &&dominoes[j - 1] == '.') 
                    visit[j - 1] -= 1;
            }
            int flag = 0;
            for(int i = 0; i < len; i++) {
                if(dominoes[i] == '.' && visit[i] != 0) {
                    if(visit[i] == 1) dominoes[i] = 'R';
                    else dominoes[i] = 'L';
                    flag = 1;
                }
            }
            if(flag == 0) return dominoes;
            for(int i = 0; i < len; i++) visit[i] = 0;
        }
        return dominoes;
    }
};