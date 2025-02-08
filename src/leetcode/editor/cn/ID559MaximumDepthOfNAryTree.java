package leetcode.editor.cn;

import leetcode.editor.util.Node;

import java.util.*;
public class ID559MaximumDepthOfNAryTree{
	public static void main(String[] args) {
		Solution solution = new ID559MaximumDepthOfNAryTree().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
		if (root == null) {
			return 0;
		}

		int depth = 0;
		for (Node node: root.children) {
			depth = Math.max(depth, maxDepth(node));
		}

		return depth + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}