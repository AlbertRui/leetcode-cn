class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        if(target >= letters.back()) return letters.front();
        int mid, low = 0, high = letters.size() - 1;
        while(low < high) {
            mid = low + (high - low) / 2;
            if(letters[mid] > target) high = mid;
            else low = mid + 1;
        }
        return letters[low];
    }
};