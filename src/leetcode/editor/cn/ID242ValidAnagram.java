package leetcode.editor.cn;

import java.lang.reflect.Array;
import java.util.*;
public class ID242ValidAnagram{
	public static void main(String[] args) {
		Solution solution = new ID242ValidAnagram().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] letterArray = new int[26];

		for (int i = 0; i < s.length(); i++) {
			letterArray[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < t.length(); i++) {
			letterArray[t.charAt(i) - 'a']--;
		}

		for (int count: letterArray) {
			if (count != 0) {
				return false;
			}
		}
		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}