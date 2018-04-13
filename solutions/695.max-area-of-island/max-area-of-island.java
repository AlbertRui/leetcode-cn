class Solution {
    public int maxAreaOfIsland(int grid[][]) {
	    int currArea = 0;
	    int area = 0;
	    for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
		        if(grid[i][j] == 1) {
		            currArea = findNeighbor(grid, i, j);
		            area = Math.max(area, currArea);
		        }
	        }
	    }
	    return area;
    }

    private int findNeighbor(int[][] nums, int i, int j) {
	    int sum = 1;
	    if(nums[i][j] == 0) {
	        return 0;
	    } else {
	        nums[i][j] = 0;
	    }
	    if(i < nums.length - 1) 
	        sum += findNeighbor(nums, i + 1, j);
	    if(j < nums[0].length - 1) 
	        sum += findNeighbor(nums, i, j + 1);
	    if(i > 0) 
	        sum += findNeighbor(nums, i - 1, j);
	    if(j > 0)
	        sum += findNeighbor(nums, i, j - 1);
	    return sum;
    }
}