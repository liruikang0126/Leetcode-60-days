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
		// 使用Deque来记录备选数值
		int n = nums.length;
		Deque<Integer> priorityQueue = new ArrayDeque<>();
		int[] result = new int[n - k + 1];

		for (int i = 0; i < n; i++) {
			// 移除(range为k-1)窗口外的元素index：i - queue.peekFirst() > k - 1
			if (!priorityQueue.isEmpty() && i - priorityQueue.peekFirst() > k - 1) {
				priorityQueue.pollFirst();
			}
			// 维持递减deque
			while (!priorityQueue.isEmpty() && nums[priorityQueue.peekLast()] < nums[i]) {
				priorityQueue.pollLast(); //移除比nums[i]小的所有数的index
			}
			// 放入当前index
			priorityQueue.offerLast(i);
			// 记录当前窗口最大值入result，从i >= k - 1 (i -k + 1 >= 0)开始
			if (i >= k - 1) {
				result[i - k + 1] = nums[priorityQueue.peekFirst()];
			}
		}

		return result;
//		// 第二次尝试，记录窗口内的max和secondMax，平均是O(n),worst case O(kn)
//        int length = nums.length;
//		int[][] result = new int[length - k + 1][4];
//		int[] output = new int[length - k + 1];
//
//		// 初始化第一个窗口
//		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
//		int indexMax = -1, indexSecondMax = -1;
//
//		for (int l = 0; l < k; l++) {
//			if (nums[l] >= max) {
//				secondMax = max;
//				indexSecondMax = indexMax;
//				max = nums[l];
//				indexMax = l;
//			} else if (nums[l] > secondMax) {
//				secondMax = nums[l];
//				indexSecondMax = l;
//			}
//		}
//
//		// If no second max exists, we assign indexSecondMax to a valid sentinel
//		if (secondMax == Integer.MIN_VALUE) {
//			indexSecondMax = -1;
//		}
//
//		result[0] = new int[]{max, indexMax, secondMax, indexSecondMax};
//		output[0] = max;
//
//		// 滑动窗口
//		for (int l = 1; l <= length - k; l++) {
//			int r = l + k - 1; // 窗口右端
//
//			int prevMax = result[l - 1][0];
//			int prevIndexMax = result[l - 1][1];
//			int prevSecondMax = result[l - 1][2];
//			int prevIndexSecondMax = result[l - 1][3];
//
//			if (prevIndexMax >= l) {
//				if (nums[r] >= prevMax) {
//					result[l] = new int[]{nums[r], r, -1, -1}; // 新的最大值
//				} else if (nums[r] > prevSecondMax) {
//					result[l] = new int[]{prevMax, prevIndexMax, nums[r], r}; // 更新第二大值
//				} else {
//					result[l] = new int[]{prevMax, prevIndexMax, prevSecondMax, prevIndexSecondMax}; // 维持原状
//				}
//			} else { //// 之前的最大值不在窗口内
//				if (nums[r] >= prevSecondMax) {
//					result[l] = new int[]{nums[r], r, -1, -1}; // 新的最大值
//				} else {
//					// 重新找到窗口最大值和次大值
//					max = nums[l];
//					indexMax = l;
//					secondMax = Integer.MIN_VALUE;
//					indexSecondMax = -1;
//
//					for (int x = l; x <= r; x++) {
//						if (nums[x] >= max) {
//							secondMax = max;
//							indexSecondMax = indexMax;
//							max = nums[x];
//							indexMax = x;
//						} else if (nums[x] > secondMax) {
//							secondMax = nums[x];
//							indexSecondMax = x;
//						}
//					}
//					result[l] = new int[]{max, indexMax, secondMax, indexSecondMax};
//				}
//			}
//			output[l] = result[l][0];
//		}
//
//		return output;

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