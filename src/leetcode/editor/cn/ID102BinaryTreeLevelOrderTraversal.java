package leetcode.editor.cn;

import leetcode.editor.util.TreeNode;

import java.util.*;
public class ID102BinaryTreeLevelOrderTraversal{
	public static void main(String[] args) {
		Solution solution = new ID102BinaryTreeLevelOrderTraversal().new Solution();
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
	public List<List<Integer>> resultList = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
		checkFunc(root, 0);
		return resultList;
    }

	public void checkFunc(TreeNode root, Integer deep) {
		if (root == null) {
			return;
		}
		deep++;

		if (resultList.size() < deep) {
			List<Integer> list = new ArrayList<>();
			resultList.add(list);
		}
		resultList.get(deep - 1).add(root.val);

		checkFunc(root.left, deep);
		checkFunc(root.right, deep);
	}
}
//leetcode submit region end(Prohibit modification and deletion)

}