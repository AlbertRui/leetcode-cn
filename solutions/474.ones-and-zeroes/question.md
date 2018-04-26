在计算机界中，我们总是追求用有限的资源获取最大的收益。

现在，假设你分别支配着 m 个&nbsp;0&nbsp;和 n 个&nbsp;1。另外，还有一个仅包含&nbsp;0&nbsp;和&nbsp;1&nbsp;字符串的数组。

你的任务是使用给定的&nbsp;m 个&nbsp;0&nbsp;和 n 个&nbsp;1&nbsp;，找到能拼出存在于数组中的字符串的最大数量。每个&nbsp;0&nbsp;和&nbsp;1&nbsp;至多被使用一次。

注意:


	给定&nbsp;0&nbsp;和&nbsp;1&nbsp;的数量都不会超过&nbsp;100。
	给定字符串数组的长度不会超过&nbsp;600。


示例 1:


输入: Array = {&quot;10&quot;, &quot;0001&quot;, &quot;111001&quot;, &quot;1&quot;, &quot;0&quot;}, m = 5, n = 3
输出: 4

解释: 总共 4 个字符串可以通过 5 个 0 和 3 个 1 拼出，即 &quot;10&quot;,&quot;0001&quot;,&quot;1&quot;,&quot;0&quot; 。


示例 2:


输入: Array = {&quot;10&quot;, &quot;0&quot;, &quot;1&quot;}, m = 1, n = 1
输出: 2

解释: 你可以拼出 &quot;10&quot;，但之后就没有剩余数字了。更好的选择是拼出 &quot;0&quot; 和 &quot;1&quot; 。

