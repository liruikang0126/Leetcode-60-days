package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID1TwoSum{
	public static void main(String[] args) {
		Solution solution = new ID1TwoSum().new Solution();

		// Add test cases
		int[] test2 = {3, 2, 4};
		int target2 = 6;
		int[] result2 = solution.twoSum(test2, target2);
		System.out.println(Arrays.toString(result2));  // Should print [1, 2]

	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
		if (length < 2) {
			return null;
		}
		if (length == 2) {
			return new int[]{0, 1};
		}

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}

		return new int[]{};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}