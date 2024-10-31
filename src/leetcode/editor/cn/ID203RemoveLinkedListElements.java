package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID203RemoveLinkedListElements{
	public static void main(String[] args) {
		Solution solution = new ID203RemoveLinkedListElements().new Solution();
		StringBuilder sb = new StringBuilder();
		
		//执行测试
		
		System.out.println(sb);		
	}
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
		ListNode curr = head;
		while (head != null && head.val == val) {
			head = head.next;
			curr = curr.next;
		}

		if (head == null) {
			return null;
		}

		while (curr != null && curr.next != null) {
			if (curr.next.val == val) {
				curr.next = curr.next.next;
				continue;
			}
			curr = curr.next;
		}

		return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}