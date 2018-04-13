给定一个字符串&nbsp;(s) 和一个字符模式&nbsp;(p)。实现支持 &#39;.&#39;&nbsp;和&nbsp;&#39;*&#39;&nbsp;的正则表达式匹配。

&#39;.&#39; 匹配任意单个字符。
&#39;*&#39; 匹配零个或多个前面的元素。


匹配应该覆盖整个字符串&nbsp;(s) ，而不是部分字符串。

说明:


	s&nbsp;可能为空，且只包含从&nbsp;a-z&nbsp;的小写字母。
	p&nbsp;可能为空，且只包含从&nbsp;a-z&nbsp;的小写字母，以及字符&nbsp;.&nbsp;和&nbsp;*。


示例 1:

输入:
s = &quot;aa&quot;
p = &quot;a&quot;
输出: false
解释: &quot;a&quot; 无法匹配 &quot;aa&quot; 整个字符串。


示例 2:

输入:
s = &quot;aa&quot;
p = &quot;a*&quot;
输出: true
解释:&nbsp;&#39;*&#39; 代表可匹配零个或多个前面的元素, 即可以匹配 &#39;a&#39; 。因此, 重复 &#39;a&#39; 一次, 字符串可变为 &quot;aa&quot;。


示例&nbsp;3:

输入:
s = &quot;ab&quot;
p = &quot;.*&quot;
输出: true
解释:&nbsp;&quot;.*&quot; 表示可匹配零个或多个(&#39;*&#39;)任意字符(&#39;.&#39;)。


示例 4:

输入:
s = &quot;aab&quot;
p = &quot;c*a*b&quot;
输出: true
解释:&nbsp;&#39;c&#39; 可以不被重复, &#39;a&#39; 可以被重复一次。因此可以匹配字符串 &quot;aab&quot;。


示例 5:

输入:
s = &quot;mississippi&quot;
p = &quot;mis*is*p*.&quot;
输出: false
