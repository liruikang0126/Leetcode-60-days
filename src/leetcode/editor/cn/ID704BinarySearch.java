package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID704BinarySearch{
	public static void main(String[] args) {
		Solution solution = new ID704BinarySearch().new Solution();
		
		//执行测试
		int[] nums = new int[] {-1, 0, 3, 5, 9, 12};
		int target = 13;
		System.out.println(solution.search(nums, target));

	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;

		int i = 0, j = length - 1;
		while (i <= j) {
			int mid = (i + j) /2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] < target) {
				i = mid + 1;
			}
			if (nums[mid] > target) {
				j = mid - 1;
			}
		}

		return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}