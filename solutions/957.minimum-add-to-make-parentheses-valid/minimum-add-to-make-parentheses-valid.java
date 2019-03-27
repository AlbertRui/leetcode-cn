class Solution {
    public int minAddToMakeValid(String S) {
        int count = 0, stack = 0;
        for(char c : S.toCharArray()) 
            if(c == '(') stack++;
            else {
                if(stack <= 0) count++;
                else stack--;
            }
        return count + stack;
    }
}