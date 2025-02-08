package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID101SymmetricTree{
	public static void main(String[] args) {
		Solution solution = new ID101SymmetricTree().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
		return compare(root.left, root.right);
    }

	private boolean compare(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		} else if (left != null && right == null) {
			return false;
		} else if (left == null && right != null) {
			return false;
		} else if (left.val != right.val) {
			return false;
		}
		// 以下是left val = right val情况，开始递归
		boolean outer = compare(left.left, right.right);
		boolean inner = compare(left.right, right.left);

		return outer && inner;
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}