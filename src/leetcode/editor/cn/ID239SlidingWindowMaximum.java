package leetcode.editor.cn;

import java.util.*;
public class ID239SlidingWindowMaximum{
	public static void main(String[] args) {
		Solution solution = new ID239SlidingWindowMaximum().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
		int[][] result = new int[length - k + 1][4];
		int[] output = new int[length - k + 1];

		// 初始化第一个窗口
		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		int indexMax = -1, indexSecondMax = -1;

		for (int l = 0; l < k; l++) {
			if (nums[l] >= max) {
				secondMax = max;
				indexSecondMax = indexMax;
				max = nums[l];
				indexMax = l;
			} else if (nums[l] > secondMax) {
				secondMax = nums[l];
				indexSecondMax = l;
			}
		}

		// If no second max exists, we assign indexSecondMax to a valid sentinel
		if (secondMax == Integer.MIN_VALUE) {
			indexSecondMax = -1;
		}

		result[0] = new int[]{max, indexMax, secondMax, indexSecondMax};
		output[0] = max;

		// 滑动窗口
		for (int l = 1; l <= length - k; l++) {
			int r = l + k - 1; // 窗口右端

			int prevMax = result[l - 1][0];
			int prevIndexMax = result[l - 1][1];
			int prevSecondMax = result[l - 1][2];
			int prevIndexSecondMax = result[l - 1][3];

			if (prevIndexMax >= l) {
				if (nums[r] >= prevMax) {
					result[l] = new int[]{nums[r], r, -1, -1}; // 新的最大值
				} else if (nums[r] > prevSecondMax) {
					result[l] = new int[]{prevMax, prevIndexMax, nums[r], r}; // 更新第二大值
				} else {
					result[l] = new int[]{prevMax, prevIndexMax, prevSecondMax, prevIndexSecondMax}; // 维持原状
				}
			} else { //// 之前的最大值不在窗口内
				if (nums[r] >= prevSecondMax) {
					result[l] = new int[]{nums[r], r, -1, -1}; // 新的最大值
				} else {
					// 重新找到窗口最大值和次大值
					max = nums[l];
					indexMax = l;
					secondMax = Integer.MIN_VALUE;
					indexSecondMax = -1;

					for (int x = l; x <= r; x++) {
						if (nums[x] >= max) {
							secondMax = max;
							indexSecondMax = indexMax;
							max = nums[x];
							indexMax = x;
						} else if (nums[x] > secondMax) {
							secondMax = nums[x];
							indexSecondMax = x;
						}
					}
					result[l] = new int[]{max, indexMax, secondMax, indexSecondMax};
				}
			}
			output[l] = result[l][0];
		}

		return output;

//		// 第一次尝试暴力法，超时
//		while (j < length) {
//			int localMax = nums[i];
//			for (int l = i; l <= j; l++) {
//				if (localMax < nums[l]) {
//					localMax = nums[l];
//				}
//			}
//			result[i] = localMax;
//			i++;
//			j++;
//		}

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}