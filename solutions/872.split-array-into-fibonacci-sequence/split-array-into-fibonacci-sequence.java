class Solution {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> res = new ArrayList<Integer>();
        if(S == null) return res;
        dfs(S, 0, res);
        return res;
    }
    private boolean dfs(String str, int start, List<Integer> res) {
        if(start == str.length() && res.size() > 2) return true;
        for(int i = start; i < str.length(); i++) {
            if(str.charAt(start) == '0' && i != start) return false;
            long num = Long.parseLong(str.substring(start, i + 1));
            if(num > Integer.MAX_VALUE) return false;
            int size = res.size();
            if(size > 1 && num > res.get(size - 1) + res.get(size - 2)) break;
            if(size < 2 || num == res.get(size - 1) + res.get(size - 2)) {
                res.add((int)num);
                if(dfs(str, i + 1, res)) return true;
                res.remove(res.size() -1);
            }
        }
        return false;
    }
}