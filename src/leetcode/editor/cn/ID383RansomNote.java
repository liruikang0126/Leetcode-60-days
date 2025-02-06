package leetcode.editor.cn;

import java.util.*;
public class ID383RansomNote{
	public static void main(String[] args) {
		Solution solution = new ID383RansomNote().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
		for (char c: magazine.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c: ransomNote.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) - 1);
		}
		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
			if (entry.getValue() < 0) {
				return false;
			}
		}

		return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}