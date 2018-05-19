class Solution {
    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length <= 1 || heightMap[0].length <= 1) return 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(c -> c[2]));
        int rows = heightMap.length, cols = heightMap[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
                    visited[i][j] = true;
                    pq.add(new int[]{i, j, heightMap[i][j]});
                }
            }
        }
        int waterTrapped = 0;
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            for (int[] dir : dirs) {
                int nx = cell[0] + dir[0];
                int ny = cell[1] + dir[1];
                if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    waterTrapped += Math.max(0, cell[2] - heightMap[nx][ny]);
                    pq.add(new int[]{nx, ny, Math.max(heightMap[nx][ny], cell[2])});
                }
            }
        }
        return waterTrapped;
    }
}