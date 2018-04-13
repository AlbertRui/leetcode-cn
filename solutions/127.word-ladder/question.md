给出两个单词（beginWord&nbsp;和 endWord）和一个字典，找到从&nbsp;beginWord 到&nbsp;endWord 的最短转换序列，转换需遵循如下规则：


	每次只能改变一个字母。
	变换过程中的中间单词必须在字典中出现。


例如，给出：
beginWord = &quot;hit&quot;
endWord = &quot;cog&quot;
wordList = [&quot;hot&quot;,&quot;dot&quot;,&quot;dog&quot;,&quot;lot&quot;,&quot;log&quot;,&quot;cog&quot;]

一个最短的变换序列是： &quot;hit&quot; -&gt; &quot;hot&quot; -&gt; &quot;dot&quot; -&gt; &quot;dog&quot; -&gt; &quot;cog&quot;，
返回长度&nbsp;5。

注意:


	如果没有这样的转换序列，则返回0。
	所有单词具有相同的长度。
	所有单词只包含小写字母字符。
	您可能会认为单词列表中没有重复项。
	你可能会认为 beginWord 和 endWord 是非空的并且不一样。


更新 (2017/1/20):

wordList 参数已被更改为字符串列表（而不是一组字符串）。请重新加载代码定义以获取最新更改。
