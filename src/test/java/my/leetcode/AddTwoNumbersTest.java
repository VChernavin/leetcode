package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AddTwoNumbersTest {
	@Test
	public void nullNullTest() {
		assertEquals(null,new AddTwoNumbers().addTwoNumbers(null,null));
	}

	@Test
	public void nullListTest() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		assertEquals(l1,new AddTwoNumbers().addTwoNumbers(null,l1));
	}

	@Test
	public void listNullTest() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		assertEquals(l1,new AddTwoNumbers().addTwoNumbers(l1,null));
	}

	@Test
	public void treeListTest() {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode res = new ListNode(7);
		res.next = new ListNode(0);
		res.next.next = new ListNode(8);
		assertEquals(l1,new AddTwoNumbers().addTwoNumbers(l1,null));
	}
}
