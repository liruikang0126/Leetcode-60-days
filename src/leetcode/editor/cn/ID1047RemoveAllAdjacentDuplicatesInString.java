package leetcode.editor.cn;

import java.util.*;
public class ID1047RemoveAllAdjacentDuplicatesInString{
	public static void main(String[] args) {
		Solution solution = new ID1047RemoveAllAdjacentDuplicatesInString().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
		if (s.length() == 1) {
			return s;
		}
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
				stack.push(s.charAt(i));
			} else {
				stack.pop();
			}
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pollLast());
		}
		return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}