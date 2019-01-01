3 x 3 的幻方是一个填充有从 1 到 9 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。

给定一个由整数组成的 N &times; N 矩阵，其中有多少个 3 &times; 3 的 &ldquo;幻方&rdquo; 子矩阵？（每个子矩阵都是连续的）。

&nbsp;

示例 1:

输入: [[4,3,8,4],
      [9,5,1,9],
      [2,7,6,2]]
输出: 1
解释: 
下面的子矩阵是一个 3 x 3 的幻方：
438
951
276

而这一个不是：
384
519
762

总的来说，在本示例所给定的矩阵中只有一个 3 x 3 的幻方子矩阵。


提示:


	1 &lt;= grid.length = grid[0].length&nbsp;&lt;= 10
	0 &lt;= grid[i][j] &lt;= 15
