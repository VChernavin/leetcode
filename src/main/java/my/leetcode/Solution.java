package my.leetcode;

public class Solution {
/*	public void test() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		System.out.println(addTwoNumbers(l1, l2));

	}*/

//	public static void main(String[] args) {
//		new Solution().test();
//	}

//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		ListNode result = new ListNode(0);
//		ListNode iterator = result;
//		int transfer = 0;
//		while (l1 != null || l2 != null) {
//			int res1 = (l1 != null) ? l1.val : 0;
//			int res2 = (l2 != null) ? l2.val : 0;
//			int sum = res1 + res2 + transfer;
//			iterator.next = new ListNode(sum % 10);
//			iterator = iterator.next;
//			transfer = sum / 10;
//
//			l1 = (l1!=null)?l1.next:null;
//			l2 = (l2!=null)?l2.next:null;
//
//		}
//
//		if(transfer>0) {
//			iterator.next=new ListNode(transfer);
//		}
//
//
//		return result.next;
//	}

	//	 Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			String res = "[" + Integer.toString(val);
			//			System.out.println(res);
			ListNode n = next;
			while (n != null) {
				res = res + "," + Integer.toString(n.val);
				n = n.next;
				//				System.out.println(res);
			}
			return res + "]";
		}

	}
}
