package leetcode.editor.cn;

import java.util.*;
public class ID15ThreeSum{
	public static void main(String[] args) {
		Solution solution = new ID15ThreeSum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> resultList = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			// 对i去重
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int left = i + 1, right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					resultList.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
					// 去重：如果 `left` 位置和前一个元素相同，则跳过
					while (left < right && nums[left] == nums[left - 1]) left++;
					// 去重：如果 `right` 位置和后一个元素相同，则跳过
					while (left < right && nums[right] == nums[right + 1]) right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}

		return resultList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}