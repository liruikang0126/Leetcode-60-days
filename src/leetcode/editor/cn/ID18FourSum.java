package leetcode.editor.cn;

import java.util.*;
public class ID18FourSum{
	public static void main(String[] args) {
		Solution solution = new ID18FourSum().new Solution();
		// 定义测试用例
		int[] nums3 = {2, 2, 2, 2, 2};
		int target3 = 8;

		// 运行测试
		System.out.println("Test Case 3: " + solution.fourSum(nums3, target3));
	}
	//leetcode submit region begin(Prohibit modification and deletion)
	class Solution {
		public List<List<Integer>> fourSum(int[] nums, int target) {
			Arrays.sort(nums);
			List<List<Integer>> result = new ArrayList<>();

			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > target && nums[i] >= 0) {
					return result; //"or" break;
				}
				if (i > 0 && nums[i] == nums[i - 1]) {
					continue;
				}

				for (int j = i + 1; j < nums.length; j++) {
					int k = j + 1, l = nums.length - 1;
					if (nums[i] + nums[j] > target && nums[i] + nums[j] >=0) {
						break;
					}
					// 这里一定要检查j大于的i+1，不是0
					if (j > i + 1 && nums[j] == nums[j - 1]) {
						continue;
					}

					while (k < l) {
						int sum = nums[i] + nums[j] + nums[k] + nums[l];
						if (sum < target) {
							k++;
						} else if (sum > target) {
							l--;
						} else {
							result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
							while (l > k && nums[k] == nums[k + 1]) k++;
							while (l > k && nums[l] == nums[l - 1]) l--;
							k++;
							l--;
						}
					}
				}
			}

			return result;
		}
	}
	//leetcode submit region end(Prohibit modification and deletion)

}