package leetcode.editor.cn;

import java.util.*;
public class ID349IntersectionOfTwoArrays{
	public static void main(String[] args) {
		Solution solution = new ID349IntersectionOfTwoArrays().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
		//方法1:HashSet，自动除重
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> resultSet = new HashSet<>();

		for (int i:
			 nums1) {
			set1.add(i);
		}
		for (int i:
			 nums2) {
			if (set1.contains(i)) {
				resultSet.add(i);
			}
		}
		return resultSet.stream().mapToInt(Integer::intValue).toArray();
		// 方法2:Array as the Hash table
//      int[] record1 = new int[1001];
//		int[] record2 = new int[1001];
//		ArrayList<Integer> result = new ArrayList<>();
//		for (int i = 0; i < nums1.length; i++) {
//			record1[nums1[i]]++;
//		}
//		for (int i = 0; i < nums2.length; i++) {
//			record2[nums2[i]]++;
//		}
//		for (int i = 0; i < 1001; i++) {
//			if (record1[i] > 0 && record2[i] > 0) {
//				result.add(i);
//			}
//		}
//		int index = 0;
//		int[] res = new int[result.size()];
//		for (int ints: result) {
//			res[index++] = ints;
//		}
//		return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}