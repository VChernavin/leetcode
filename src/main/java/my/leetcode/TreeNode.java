package my.leetcode;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof TreeNode)) {
			return false;
		}

		TreeNode node = (TreeNode) o;

		return new org.apache.commons.lang3.builder.EqualsBuilder()
				.append(val, node.val)
				.append(left, node.left)
				.append(right, node.right)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
				.append(val)
				.append(left)
				.append(right)
				.toHashCode();
	}

	@Override
	public String toString() {
		return "TreeNode{" +
				"val=" + val +
				", left=" + left +
				", right=" + right +
				'}';
	}
}
