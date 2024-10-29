package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID209MinimumSizeSubarraySum{
	public static void main(String[] args) {
		Solution solution = new ID209MinimumSizeSubarraySum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
		int i = 0, j = 0;
		int result_length = 0;
		int sum = nums[0];
		while (i < nums.length && j < nums.length) {
			if (sum >= target) {
				int temp = j - i + 1;
				if (temp == 1) {
					return 1;
				}
				if (result_length > temp || result_length == 0) {
					result_length = temp;
				}
				sum -= nums[i++];
			} else {
				if (j == nums.length - 1) {
					break;
				}
				sum += nums[++j];
			}
		}
		return result_length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}