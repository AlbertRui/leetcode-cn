class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<String>();
        int[] timeCode = new int[10];
        dfs(timeCode, 0, 0, num, res);
        return res;
    }
    private void dfs(int[] timeCode, int i, int k, int num, List<String> res) {
        if(k == num) {
            String curRes = deCodeTime(timeCode);
            if(curRes != null)
                res.add(curRes);
            return;
        }
        if(i == timeCode.length) return;
        timeCode[i] = 1;
        dfs(timeCode, i + 1, k + 1, num, res);
        timeCode[i] = 0;
        dfs(timeCode, i + 1, k, num, res);
    }
    private String deCodeTime(int[] timeCode) {
        int hours = 0;
        for(int i = 0; i < 4; i++) 
            if(timeCode[i] == 1)
                hours += Math.pow(2, i);
        int minutes = 0;
        for(int i = 4; i < 10; i++) 
            if(timeCode[i] == 1)
                minutes += Math.pow(2, i - 4);
        if(hours >= 12 || minutes >= 60) return null;
        return hours + (minutes < 10 ? ":0" : ":") + minutes;
    }
}