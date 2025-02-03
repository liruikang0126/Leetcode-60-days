package leetcode.editor.cn;

import com.sun.source.tree.Tree;
import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID94BinaryTreeInorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID94BinaryTreeInorderTraversal().new Solution();
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
    public List<Integer> inorderTraversal(TreeNode root) {
		// Iteration way, use stack
		List<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;

		while (curr != null || !stack.isEmpty()) {
			if (curr != null) {
				stack.push(curr);
				curr = curr.left;
			} else {
				curr = stack.pop();
				result.add(curr.val);
				curr = curr.right;
			}
		}

		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}