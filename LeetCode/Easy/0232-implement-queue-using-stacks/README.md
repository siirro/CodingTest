<h2><a href="https://leetcode.com/problems/implement-queue-using-stacks/">232. Implement Queue using Stacks</a></h2><h3>Easy</h3><hr><div><p><font _mstmutation="1">Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (, , , and ).</font><code>push</code><code>peek</code><code>pop</code><code>empty</code></p>

<p><font _mstmutation="1">Implement the  class:</font><code>MyQueue</code></p>

<ul>
	<li><code>void push(int x)</code><font _mstmutation="1"> Pushes element x to the back of the queue.</font></li>
	<li><code>int pop()</code><font _mstmutation="1"> Removes the element from the front of the queue and returns it.</font></li>
	<li><code>int peek()</code><font _mstmutation="1"> Returns the element at the front of the queue.</font></li>
	<li><code>boolean empty()</code><font _mstmutation="1"> Returns  if the queue is empty,  otherwise.</font><code>true</code><code>false</code></li>
</ul>

<p><strong>Notes:</strong></p>

<ul>
	<li><font _mstmutation="1">You must use <strong _mstmutation="1">only</strong> standard operations of a stack, which means only , , , and  operations are valid.</font><code>push to top</code><code>peek/pop from top</code><code>size</code><code>is empty</code></li>
	<li>Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input</strong>
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
<strong>Output</strong>
[null, null, null, 1, 1, false]

<strong>Explanation</strong>
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= x &lt;= 9</code></li>
	<li><font _mstmutation="1">At most &nbsp;calls will be made to , , , and .</font><code>100</code><code>push</code><code>pop</code><code>peek</code><code>empty</code></li>
	<li><font _mstmutation="1">All the calls to  and  are valid.</font><code>pop</code><code>peek</code></li>
</ul>

<p>&nbsp;</p>
<p><font _mstmutation="1"><strong _mstmutation="1">Follow-up:</strong> Can you implement the queue such that each operation is <strong _mstmutation="1"><a href="https://en.wikipedia.org/wiki/Amortized_analysis" target="_blank">amortized</a></strong>  time complexity? In other words, performing  operations will take overall  time even if one of those operations may take longer.</font><code>O(1)</code><code>n</code><code>O(n)</code></p>
</div>