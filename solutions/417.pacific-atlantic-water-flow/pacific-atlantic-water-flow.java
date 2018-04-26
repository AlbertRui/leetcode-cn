class Solution {
    int dx[] = {0, 0, -1, 1};
    int dy[] = {1, -1, 0, 0};

    //判断一个节点能否流通到海洋
    private void flow(boolean visited[][], int matrix[][], int x, int y, int n, int m) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                //一个节点是只能留到不高于自己高度的节点，但是我们这里是反过来找能从nxny留到xy的节点，所以这里注意下
                if (!visited[nx][ny] && matrix[nx][ny] >= matrix[x][y])
                    flow(visited, matrix, nx, ny, n, m);
            }
        }
    }

    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> res = new ArrayList<>();
        int n = matrix.length;
        if (n == 0) return res;
        int m = matrix[0].length;
        boolean PV[][] = new boolean[n][m];
        boolean AV[][] = new boolean[n][m];
        // 这里从所有临海的地方到这回去判断某个节点是否能流到对应的地方
        for (int i = 0; i < n; i++) {
            flow(PV, matrix, i, 0, n, m);
            flow(AV, matrix, i, m - 1, n, m);
        }
        for (int i = 0; i < m; i++) {
            flow(PV, matrix, 0, i, n, m);
            flow(AV, matrix, n - 1, i, n, m);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (PV[i][j] && AV[i][j])
                    res.add(new int[]{i, j});
            }
        }
        return res;
    }
}