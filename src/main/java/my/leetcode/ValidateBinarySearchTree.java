package my.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		boolean l;
		boolean r;
		List head = new ArrayList();
		head.add(root.val);
		l = root.left == null || (root.val > root.left.val && checkLeftRight(root.left,head));
		r = root.right == null || (root.val < root.right.val && checkLeftRight(root.right,head));

		return l && r;
	}

	private boolean checkLeftRight(TreeNode node, List<Integer> previous) {
		if (node == null) {
			return false;
		}
		boolean l;
		boolean r;
		l = node.left == null || (node.val > node.left.val /*&& previous.stream().filter(x -> x <node.left.val) && checkLeftRight(node.left,node.val)*/);
		r = node.right == null || (node.val < node.right.val /*&& node.right.val < previous  && checkLeftRight(node.right,node.val)*/);

		return l && r;
	}

	private boolean more(Integer i) {
		return false;
	}

}
