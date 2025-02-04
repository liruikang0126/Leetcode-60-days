package leetcode.editor.cn;

import java.util.*;
public class ID20ValidParentheses{
	public static void main(String[] args) {
		Solution solution = new ID20ValidParentheses().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
		if (s.length() % 2 != 0 || s.charAt(0) == ')' ||
				s.charAt(0) == ']' || s.charAt(0) == '}') {
			return false;
		}
        Deque<Character> stack = new ArrayDeque<>();
		stack.push(s.charAt(0));
		int i = 1;
		while (i < s.length()) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
			} else {
				char c = stack.peek();
				if (c == '(' && s.charAt(i) == ')') {
					stack.pop();
				} else if (c == '[' && s.charAt(i) == ']') {
					stack.pop();
				} else if (c == '{' && s.charAt(i) == '}') {
					stack.pop();
				} else {
					stack.push(s.charAt(i));
				}
			}
			i++;
		}
		return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}