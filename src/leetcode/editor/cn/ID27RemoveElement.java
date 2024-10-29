package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID27RemoveElement{
	public static void main(String[] args) {
		Solution solution = new ID27RemoveElement().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
		int slow = 0;

		for (int fast = 0; fast < length; fast++) {
			if (nums[fast] != val) {
				nums[slow] = nums[fast];
				slow++;
			}
		}

		return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}