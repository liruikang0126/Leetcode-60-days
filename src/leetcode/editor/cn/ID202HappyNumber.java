package leetcode.editor.cn;

import java.util.*;
public class ID202HappyNumber{
	public static void main(String[] args) {
		Solution solution = new ID202HappyNumber().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isHappy(int n) {
        //只剩一位数时，只有1，7 可以最终变为快乐数
		HashSet<Integer> set = new HashSet<>();
		while (!set.contains(n)) {
			if (n == 1) {
				return true;
			}
			set.add(n);
			n = getNextSum(n);
		}
		return false;
    }

	private int getNextSum(int n) {
		int res = 0;
		while (n > 0) {
			int temp = (n % 10) * (n % 10);
			res += temp;
			n = n / 10;
		}
		return res;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}