package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID104MaximumDepthOfBinaryTree{
	public static void main(String[] args) {
		Solution solution = new ID104MaximumDepthOfBinaryTree().new Solution();
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
	public List<List<Integer>> result = new ArrayList<>();
    public int maxDepth(TreeNode root) {
		checkFunc(root, 0);
		return result.size();
    }

	private void checkFunc(TreeNode root, int depth) {
		if (root == null) {
			return;
		}
		depth++;

		if (result.size() < depth) {
			List<Integer> list = new ArrayList<>();
			result.add(list);
		}
		result.get(depth - 1).add(root.val);

		checkFunc(root.left, depth);
		checkFunc(root.right, depth);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}