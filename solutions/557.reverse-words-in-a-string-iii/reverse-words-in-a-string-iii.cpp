class Solution {
public:
    string reverseWords(string s) {
        auto begin = s.begin();
        for(auto iter = s.begin();iter!=s.end();++iter){
            if(*iter==' '){
                reverse(begin,iter);
                begin = iter+1;
            }
        }
        reverse(begin,s.end());
        
        return s;
    }
};