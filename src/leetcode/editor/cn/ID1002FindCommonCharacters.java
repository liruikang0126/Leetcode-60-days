package leetcode.editor.cn;

import java.util.*;
public class ID1002FindCommonCharacters{
	public static void main(String[] args) {
		Solution solution = new ID1002FindCommonCharacters().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> commonChars(String[] words) {
		int[] record = new int[26];
		for (int i = 0; i < words[0].length(); i++) {
			record[words[0].charAt(i) - 'a']++;
		}


		for (int i = 1; i < words.length; i++) {
			int[] curr = new int[26];
			for (int j = 0; j < words[i].length(); j++) {
				curr[words[i].charAt(j) - 'a']++;
			}
			for (int k = 0; k < 26; k++) {
				if (record[k] != curr[k]) {
					record[k] = Math.min(record[k], curr[k]);
				}
			}
		}

		int countLength = 0;
		for (int i = 0; i < 26; i++) {
			countLength += record[i];
		}

		List<String> result = new ArrayList<>(countLength);
		for (int i = 0; i < record.length; i++) {
			// 获取当前字母
			char currentChar = (char) ('a' + i);

			// 根据字母的出现次数，将其添加到 List 中
			for (int j = 0; j < record[i]; j++) {
				result.add(String.valueOf(currentChar));
			}
		}

		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}