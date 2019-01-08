class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        char[] resArr = countAndSay(n - 1).toCharArray();
        int count = 1;
        StringBuilder res = new StringBuilder();
        for(int i = 1; i < resArr.length; i++) {
            if(resArr[i - 1] != resArr[i]) {
                res.append(count).append(resArr[i -1]);
                count = 1;
            } else count++;
        }
        return res.append(count).append(resArr[resArr.length - 1]).toString();
    }
}