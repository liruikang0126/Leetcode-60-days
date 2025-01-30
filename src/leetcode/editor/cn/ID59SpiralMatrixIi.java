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
		int left = 0, rihgt = n - 1, top = 0, bottom = n - 1;
		int[][] mat = new int[n][n];
		int num = 1, target = n * n;

		while (num <= target) {
			for (int i = left; i <= rihgt; i++) {
				mat[top][i] = num++; // left to rihgt
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				mat[i][rihgt] = num++; // top to bottom
			}
			rihgt--;
			for (int i = rihgt; i >= left; i--) {
				mat[bottom][i] = num++; // right to left
			}
			bottom--;
			for (int i = bottom; i >= top; i--) {
				mat[i][left] = num++;
			}
			left++;
		}

		return mat;

//		int[][] nums = new int[n][n];
//		int startX = 0, startY = 0;
//		int offset = 1;
//		int count = 1;
//		int loop = 1;
//		int i, j;
//
//		while (loop <= n / 2) {
//			//顶部：左闭右开
//			for (j = startX; j < n - offset; j++) {
//				nums[startX][j] = count++;
//			}
//			//右列：左闭右开
//			for (i = startY; i < n - offset; i++) {
//				nums[i][j] = count++;
//			}
//			//底部：左闭右开
//			for (; j > startX; j--) {
//				nums[i][j] = count++;
//			}
//			//左列：左闭右开
//			for (; i > startY; i--) {
//				nums[i][j] = count++;
//			}
//			loop++;
//			startX++;
//			startY++;
//			offset++;
//		}
//
//		if (n % 2 == 1) {
//			nums[startX][startY] = count;
//		}
//
//		return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}