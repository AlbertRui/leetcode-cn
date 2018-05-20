class Solution {
    private List<List<String>> result = new ArrayList<>();
    private StringBuilder point = new StringBuilder();
    private boolean col[];
    private boolean skewL[];
    private boolean skewR[];

    private void dfs(int n, List<Integer> list) {
        if (list.size() == n) {
            List<String> line = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                point.replace(list.get(i), list.get(i) + 1, "Q");
                line.add(point.toString());
                point.replace(list.get(i), list.get(i) + 1, ".");
            }
            result.add(line);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (col[i] || skewL[n + (list.size() - i)] || skewR[i + list.size()]) continue;
            col[i] = true;
            skewL[n + (list.size() - i)] = true;
            skewR[i + list.size()] = true;
            list.add(i);
            dfs(n, list);
            list.remove(list.size() - 1);
            col[i] = false;
            skewL[n + (list.size() - i)] = false;
            skewR[i + list.size()] = false;
        }
    }

    public List<List<String>> solveNQueens(int n) {
        for (int i = 0; i < n; i++) point.append('.');
        col = new boolean[n];
        skewL = new boolean[n << 1];
        skewR = new boolean[n << 1];

        dfs(n, new ArrayList<>());

        return result;
    }
}