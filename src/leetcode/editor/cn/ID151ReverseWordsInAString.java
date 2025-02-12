package leetcode.editor.cn;

import java.util.*;
public class ID151ReverseWordsInAString{
	public static void main(String[] args) {
		Solution solution = new ID151ReverseWordsInAString().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
		// 1. 规范空格，用deleteSpace方法
		// 2. 将整个string翻转
		// 3. 将每个word翻转回来

        StringBuilder sb = deleteSpace(s); // 1
		reverseSubString(sb, 0, sb.length() - 1); // 2
		reverseEachWord(sb); //3

		return sb.toString();
    }

	private StringBuilder deleteSpace(String s) {
		StringBuilder sb = new StringBuilder();
		int start = 0, end = s.length() - 1;
		// 将开头结尾跳到第一个不是‘ ’的位置
		while (s.charAt(start) == ' ') start++;
		while (s.charAt(end) == ' ') end--;

		while (start <= end) {
			char c = s.charAt(start);
			if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
				sb.append(c);
			}
			start++;
		}

		return sb;
	}

	private void reverseSubString(StringBuilder sb, int start, int end) {
		while (start < end) {
			char temp = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, temp);
			start++;
			end--;
		}
	}

	 private void reverseEachWord(StringBuilder sb) {
		int start = 0, end = 1;

		while (end < sb.length()) {
			while (end < sb.length() && sb.charAt(end) != ' ') end++;
			reverseSubString(sb, start, end - 1);
			start = end + 1;
			end = start + 1;
		}
	 }
}
//leetcode submit region end(Prohibit modification and deletion)

}