给出一个字符串数组words组成的一本英语词典。从中找出最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成。若其中有多个可行的答案，则返回答案中字典序最小的单词。

若无答案，则返回空字符串。

示例 1:


输入: 
words = [&quot;w&quot;,&quot;wo&quot;,&quot;wor&quot;,&quot;worl&quot;, &quot;world&quot;]
输出: &quot;world&quot;
解释: 
单词&quot;world&quot;可由&quot;w&quot;, &quot;wo&quot;, &quot;wor&quot;, 和 &quot;worl&quot;添加一个字母组成。


示例 2:


输入: 
words = [&quot;a&quot;, &quot;banana&quot;, &quot;app&quot;, &quot;appl&quot;, &quot;ap&quot;, &quot;apply&quot;, &quot;apple&quot;]
输出: &quot;apple&quot;
解释: 
&quot;apply&quot;和&quot;apple&quot;都能由词典中的单词组成。但是&quot;apple&quot;得字典序小于&quot;apply&quot;。


注意:


	所有输入的字符串都只包含小写字母。
	words数组长度范围为[1,1000]。
	words[i]的长度范围为[1,30]。

