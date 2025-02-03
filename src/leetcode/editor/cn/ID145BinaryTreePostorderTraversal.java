package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID145BinaryTreePostorderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID145BinaryTreePostorderTraversal().new Solution();
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
    public List<Integer> postorderTraversal(TreeNode root) {
        // 本题用迭代法iteration，不用递归法（递归法与144题只需调整一下顺序）
		List<Integer> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode curr = stack.pop();
			result.add(curr.val);

			if (curr.left != null) {
				stack.push(curr.left);
			}
			if (curr.right != null) {
				stack.push(curr.right);
			}
		}

		Collections.reverse(result);
		return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}