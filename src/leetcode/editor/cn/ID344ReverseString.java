package leetcode.editor.cn;

import java.util.*;
public class ID344ReverseString{
	public static void main(String[] args) {
		Solution solution = new ID344ReverseString().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
		while (i < j) {
			char temp = s[j];
			s[j] = s[i];
			s[i] = temp;
			i++;
			j--;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}