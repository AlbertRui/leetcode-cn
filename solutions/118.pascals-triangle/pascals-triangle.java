class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;
        List<Integer> preRes, curRes = new ArrayList<>();
        curRes.add(1);
        res.add(curRes);
        int j = 0;
        for(int i = 1; i < numRows; i++) {
            preRes = res.get(i - 1);
            curRes = new ArrayList<>();
            curRes.add(1);
            j = i;
            while(--j > 0) 
                curRes.add(preRes.get(j) + preRes.get(j - 1));
            curRes.add(1);
            res.add(curRes);
        } 
        return res;
    }
}