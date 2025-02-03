package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID144BinaryTreePreorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID144BinaryTreePreorderTraversal().new Solution();
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
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		traversal(root, result);
		return result;
	}

	public void traversal(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;  // ✅ 直接 return，避免返回 null
		}
		result.add(root.val);
		traversal(root.left, result);
		traversal(root.right, result);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}