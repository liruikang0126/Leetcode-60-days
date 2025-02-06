package leetcode.editor.cn;

import java.util.*;
public class ID454FourSumIi{
	public static void main(String[] args) {
		Solution solution = new ID454FourSumIi().new Solution();
		int[] nums1 = {-1, -1};
		int[] nums2 = {-1, 1};
		int[] nums3 = {-1, 1};
		int[] nums4 = {1, -1};
		System.out.println(solution.fourSumCount(nums1, nums2, nums3, nums4));
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		int result = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		fillMap(nums1, nums2, map);

		for (int i: nums3) {
			for (int j: nums4) {
				result += map.getOrDefault(-i - j, 0);
			}
		}

		return result;
//		// 第二次尝试：两两组合，成功，思路正确但可以简化为一个map，节省空间
//		int result = 0;
//		// <K, V> K表示两个数可能的sum，V表示这个sum的组合数，
//		// 如<-2,2>表示两个数的sum为2的不同组合为2种
//		HashMap<Integer, Integer> map1 = new HashMap<>();
//		HashMap<Integer, Integer> map2 = new HashMap<>();
//		// 把1，2；3，4的sum组合数总结出来如下
//		fillMap(nums1, nums2, map1);
//		fillMap(nums3, nums4, map2);
//		// 匹配map1，map2的K，相加为0的组合V*V得到总组合数
//		result = countZeros(map1, map2);
//
//		return result;
//		// 以下是第一次的尝试，暴力解法超时， Time O(n^4) Space O(n^3)
//      HashMap<List<Integer>, Integer> firstThreeSumMap = new HashMap<>();
//		int firstThreeResult;
//
//		for (int i = 0; i < nums1.length; i++) {
//			for (int j = 0; j < nums2.length; j++) {
//				for (int k = 0; k < nums3.length; k++) {
//					firstThreeResult = nums1[i] + nums2[j] + nums3[k];
//					ArrayList<Integer> firstThreeTuple = new ArrayList<>();
//					firstThreeTuple.add(i);
//					firstThreeTuple.add(j);
//					firstThreeTuple.add(k);
//					firstThreeSumMap.put(firstThreeTuple, firstThreeResult);
//				}
//			}
//		}
//		HashSet<List<Integer>> resultSet = new HashSet<>();
//        for (int i = 0; i < nums4.length; i++) {
//            int complement = -nums4[i];
//            if (firstThreeSumMap.containsValue(complement)) {
//				for (Map.Entry<List<Integer>, Integer> entry : firstThreeSumMap.entrySet()) {
//					if (entry.getValue().equals(complement)) {
//						List<Integer> fourTuple = new ArrayList<>();
//						fourTuple = entry.getKey();
//						fourTuple.add(i);
//						resultSet.add(fourTuple);
//					}
//				}
//			}
//        }
//		return resultSet.size();
    }

	private void fillMap(int[] nums1, int[] nums2, HashMap<Integer, Integer> map) {
		for (int k : nums1) {
			for (int i : nums2) {
				int sum = k + i;
				map.put(sum, map.getOrDefault(sum, 0) + 1);
			}
		}
	}

	private int countZeros(HashMap<Integer, Integer> map1, HashMap<Integer, Integer> map2) {
		int count = 0;
		for (Map.Entry<Integer, Integer> entry: map1.entrySet()) {
			int key1 = entry.getKey(), count1 = entry.getValue();;
			if (map2.containsKey(-key1)) {
				int count2 = map2.get(-key1);
				count += count1 * count2;
			}
		}

		return count;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}