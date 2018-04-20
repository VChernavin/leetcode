package my.leetcode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode iterator = result;
		int transfer = 0;
		while (l1 != null || l2 != null) {
			int res1 = (l1 != null) ? l1.val : 0;
			int res2 = (l2 != null) ? l2.val : 0;
			int sum = res1 + res2 + transfer;
			iterator.next = new ListNode(sum % 10);
			iterator = iterator.next;
			transfer = sum / 10;

			l1 = (l1 != null) ? l1.next : null;
			l2 = (l2 != null) ? l2.next : null;

		}

		return result.next;
	}
}
