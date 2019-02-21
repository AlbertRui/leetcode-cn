class Solution {
public:
    vector<int> deckRevealedIncreasing(vector<int>& deck) {
        //Just do the Counter Operation
		int n = deck.size();
		vector<int> res(n);
		sort(deck.begin(), deck.end());
		res[n-1] = deck.back();
		for(int i = n - 2; i >= 0; --i){
			res[i] = deck[i];
			rotate(res.begin() + i + 1, res.end() - 1, res.end());
		}
		return res;
    }
};