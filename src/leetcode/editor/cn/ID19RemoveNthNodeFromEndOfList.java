package leetcode.editor.cn;

import leetcode.editor.util.ListNode;

import java.util.*;
public class ID19RemoveNthNodeFromEndOfList{
	public static void main(String[] args) {
		Solution solution = new ID19RemoveNthNodeFromEndOfList().new Solution();
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || head.next == null) {
			return null;
		}

		ListNode curr = head;
		int count = 1;

		while (curr.next != null) {
			curr = curr.next;
			count++;
		}

		int removedIndex = count - n;
		if (removedIndex < 0) {
			return head;
		} else if (removedIndex == 0) {
			return head.next;
		}

		curr = head;
		for (int i = 1; i < removedIndex; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;

		return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}