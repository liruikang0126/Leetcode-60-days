package leetcode.editor.cn;

import java.util.*;
public class ID150EvaluateReversePolishNotation{
	public static void main(String[] args) {
		Solution solution = new ID150EvaluateReversePolishNotation().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int evalRPN(String[] tokens) {
		Deque<Integer> deque = new ArrayDeque<>();
		int i = 0;

		while (i < tokens.length) {
			if (tokens[i].equals("+")) {
				deque.push(deque.pop() + deque.pop());
			} else if (tokens[i].equals("-")) {
				int b = deque.pop();
				int a = deque.pop();
				deque.push(a - b);
			} else if (tokens[i].equals("*")) {
				deque.push(deque.pop() * deque.pop());
			} else if (tokens[i].equals("/")) {
				int b = deque.pop();
				int a = deque.pop();
				deque.push(a / b);
			} else {
				deque.push(Integer.parseInt(tokens[i]));
			}
			i++;
		}

		return deque.pop();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}