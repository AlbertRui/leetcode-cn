class Solution {
    public int[] beautifulArray(int N) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        List<Integer> list = null;
        while(res.size() < N) {
            list = new ArrayList<>();
            for(int i : res) if(2 * i - 1 <= N) list.add(2 * i - 1);
            for(int i : res) if(2 * i <= N) list.add(2 * i);
            res = list;
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}