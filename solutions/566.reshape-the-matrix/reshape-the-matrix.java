class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m =	nums[0].length;
		int n = nums.length;
		if (r * c != n * m) {
			return nums;
		}
		int[][] res = new int[r][c];
		for (int i = 0; i < r*c; i++) {
			res[i/c][i%c] = nums[i/m][i%m];
		}
		return res;
    }
}