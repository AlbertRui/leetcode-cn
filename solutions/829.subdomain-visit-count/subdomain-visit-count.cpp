class Solution {
public:
    vector<string> subdomainVisits(vector<string>& cpdomains) {
        unordered_map<string, int> count;
        for(string cpdomain : cpdomains) {
            int i = cpdomain.find(' ');
            int num = stoi(cpdomain.substr(0, i));
            string domain = cpdomain.substr(i + 1);
            for(i = 0; i < domain.size(); i++) 
                if(domain[i] == '.') count[domain.substr(i + 1)] += num;
            count[domain] += num;
        }
        vector<string> res;
        for(auto k : count) 
            res.push_back(to_string(k.second) + " " + k.first);
        return res;
    }
};