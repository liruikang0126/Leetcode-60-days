package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID59SpiralMatrixIi{
	public static void main(String[] args) {
		Solution solution = new ID59SpiralMatrixIi().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
		int startX = 0, startY = 0;
		int offset = 1;
		int count = 1;
		int loop = 1;
		int i, j;

		while (loop <= n / 2) {
			//顶部：左闭右开
			for (j = startX; j < n - offset; j++) {
				nums[startX][j] = count++;
			}
			//右列：左闭右开
			for (i = startY; i < n - offset; i++) {
				nums[i][j] = count++;
			}
			//底部：左闭右开
			for (; j > startX; j--) {
				nums[i][j] = count++;
			}
			//左列：左闭右开
			for (; i > startY; i--) {
				nums[i][j] = count++;
			}
			loop++;
			startX++;
			startY++;
			offset++;
		}

		if (n % 2 == 1) {
			nums[startX][startY] = count;
		}

		return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}