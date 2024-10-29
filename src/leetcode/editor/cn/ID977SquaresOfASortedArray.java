package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID977SquaresOfASortedArray{
	public static void main(String[] args) {
		Solution solution = new ID977SquaresOfASortedArray().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
		int[] result = new int[length];

		int i = 0, j = length - 1, k = length - 1;
		while (i <= j) {
			if (nums[i] * nums[i] <= nums[j] * nums[j]) {
				result[k] = nums[j] * nums[j];
				k--;
				j--;
			} else {
				result[k] = nums[i] * nums[i];
				k--;
				i++;
			}
		}

		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}