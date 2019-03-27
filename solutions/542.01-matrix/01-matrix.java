class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0; i < m; i++) 
            for(int j = 0; j < n; j++) 
                if(matrix[i][j] == 0) 
                    queue.offer(new int[]{i, j});
                else matrix[i][j] = Integer.MAX_VALUE;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while(!queue.isEmpty()) {
            int[] cell = queue.poll();
            for(int[] dir : dirs) {
                int r = cell[0] + dir[0];
                int c = cell[1] + dir[1];
                if(r >= 0 && r < m && c >= 0 && c < n && matrix[r][c] > matrix[cell[0]][cell[1]] + 1) {
                    queue.offer(new int[]{r, c});
                    matrix[r][c] = matrix[cell[0]][cell[1]] + 1;
                }
            }
        }
        return matrix;
    }
}