package leetcode.editor.cn;

import java.util.*;
public class ID541ReverseStringIi{
	public static void main(String[] args) {
		Solution solution = new ID541ReverseStringIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseStr(String s, int k) {
		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i += 2 * k) {
			int left = i, right = Math.min(left + k - 1, chars.length - 1);
			while (left < right) {
				char temp = chars[right];
				chars[right] = chars[left];
				chars[left] = temp;
				left++;
				right--;
			}
		}
		return new String(chars);

//		// My solution: beats 5.27%
//		List<Character> list = new ArrayList<>();
//		for (int i = 0; i < s.length(); i++) {
//			list.add(s.charAt(i));
//		}
//		// Start to reverse the first 2k's letters
//		int rem = s.length(), currIndex = 0;
//		while (rem / (2*k) > 0) {
//			// 局部反转（k）
//			int left = currIndex, right = currIndex + k - 1;
//			reverse(list, left, right);
//			currIndex += 2 * k;
//			rem -= 2 * k;
//		}
//		// Deal with the tail (<2k part)
//		reverse(list, currIndex, currIndex + Math.min(k, rem) - 1);
//
//		StringBuilder sb = new StringBuilder();
//		for (char c: list) {
//			sb.append(c);
//		}
//
//		return sb.toString();
    }

	public void reverse(List<Character> list, int left, int right) {
		while (left < right) {
			char temp = list.get(right);
			list.set(right, list.get(left));
			list.set(left, temp);
			left++;
			right--;
		}
	}

}
//leetcode submit region end(Prohibit modification and deletion)

}