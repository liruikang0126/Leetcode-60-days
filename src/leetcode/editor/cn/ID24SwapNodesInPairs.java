package leetcode.editor.cn;

import java.util.*;
import leetcode.editor.util.*;

public class ID24SwapNodesInPairs{
	public static void main(String[] args) {
		Solution solution = new ID24SwapNodesInPairs().new Solution();

		// Create test case [1,2,3,4]
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);

		// Print original list
		System.out.println("Original list: " + printList(head));

		// Execute the solution
		ListNode result = solution.swapPairs(head);

		// Print result
		System.out.println("After swapping: " + printList(result));
	}

	// Helper method to print list
	private static String printList(ListNode head) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		ListNode current = head;
		while (current != null) {
			sb.append(current.val);
			if (current.next != null) {
				sb.append(",");
			}
			current = current.next;
		}
		sb.append("]");
		return sb.toString();
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
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
			return null;
		}

		//check odd / even elements,（本来想这样但是发现linkedlist不iterate一遍无法知道node个数
		//check if the remaining elements is single
		ListNode curr = head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;
		ListNode temp;
		while (curr != null) {
			if (curr.next == null) {
				return head;
			}
			temp = curr.next;
			curr.next = curr.next.next;
			temp.next = curr;
			if (curr == head) {
				head = temp;
			}
			prev.next = temp;
			prev = curr;
			curr = curr.next;
		}

		return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}