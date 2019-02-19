class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        int i = 0; 
        while(i < n) {
            if(++i % 3 == 0) {
                if(i % 5 == 0) res.add("FizzBuzz");
                else res.add("Fizz");
            } else if(i % 5 == 0) {
                res.add("Buzz");
            } else res.add(i + "");
        }
        return res;
    }
}