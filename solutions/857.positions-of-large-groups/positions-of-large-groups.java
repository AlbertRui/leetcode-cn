class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        char[] arrStr = S.toCharArray();
        int count = 1, n = arrStr.length;
        List<Integer> curRes;
        for(int i = 1; i < n - 1; i++) {
            if(arrStr[i] == arrStr[i - 1]) count++;
            else count = 1;
            if(count >= 3 && arrStr[i] != arrStr[i + 1]) {
                curRes = new ArrayList<>();
                curRes.add(i - count + 1);
                curRes.add(i);
                res.add(curRes);
            }
        }
        if(count >= 2 && arrStr[n - 1] == arrStr[n - 2]) {
            curRes = new ArrayList<>();
            curRes.add(n - count - 1);
            curRes.add(n - 1);
            res.add(curRes);
        }
        return res;
    }
}