class Solution {
    public int[] constructArray(int n, int k) {
	int index = 0;
	int[] arr = new int[n];
	// 最大n-1
	for (int i = 1, j = n; i <= j;) {
	    if (k > 1) {
		arr[index ++] = (k-- % 2 == 1? i++ : j--);
	    } else {
		arr[index ++] = i++;
	    }
	}
	return arr;
    }
}