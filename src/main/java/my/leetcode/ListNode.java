package my.leetcode;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		String res = "[" + Integer.toString(val);
		ListNode n = next;
		while (n != null) {
			res = res + "," + Integer.toString(n.val);
			n = n.next;
		}
		return res + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof ListNode)) {
			return false;
		}

		ListNode listNode = (ListNode) o;

		return new EqualsBuilder()
				.append(val, listNode.val)
				.append(next, listNode.next)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37)
				.append(val)
				.append(next)
				.toHashCode();
	}
}
