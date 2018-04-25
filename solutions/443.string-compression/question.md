给定一组字符，使用原地算法将其压缩。

压缩后的长度必须始终小于或等于原数组长度。

数组的每个元素应该是长度为1&nbsp;的字符（不是 int 整数类型）。

在完成原地修改输入数组后，返回数组的新长度。

&nbsp;

进阶：
你能否仅使用O(1) 空间解决问题？

&nbsp;

示例 1：


输入：
[&quot;a&quot;,&quot;a&quot;,&quot;b&quot;,&quot;b&quot;,&quot;c&quot;,&quot;c&quot;,&quot;c&quot;]

输出：
返回6，输入数组的前6个字符应该是：[&quot;a&quot;,&quot;2&quot;,&quot;b&quot;,&quot;2&quot;,&quot;c&quot;,&quot;3&quot;]

说明：
&quot;aa&quot;被&quot;a2&quot;替代。&quot;bb&quot;被&quot;b2&quot;替代。&quot;ccc&quot;被&quot;c3&quot;替代。


示例 2：


输入：
[&quot;a&quot;]

输出：
返回1，输入数组的前1个字符应该是：[&quot;a&quot;]

说明：
没有任何字符串被替代。


示例 3：


输入：
[&quot;a&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;]

输出：
返回4，输入数组的前4个字符应该是：[&quot;a&quot;,&quot;b&quot;,&quot;1&quot;,&quot;2&quot;]。

说明：
由于字符&quot;a&quot;不重复，所以不会被压缩。&quot;bbbbbbbbbbbb&quot;被&ldquo;b12&rdquo;替代。
注意每个数字在数组中都有它自己的位置。


注意：


	所有字符都有一个ASCII值在[35, 126]区间内。
	1 &lt;= len(chars) &lt;= 1000。

