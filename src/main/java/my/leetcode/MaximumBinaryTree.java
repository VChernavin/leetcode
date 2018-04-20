package my.leetcode;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class MaximumBinaryTree {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return makeTree(nums, 0, nums.length);
	}

	private static TreeNode makeTree(int[] nums, int first, int last) {
		if (first == last) {
			return null;
		}
		int maxI = max(nums, first, last);
		TreeNode root = new TreeNode(nums[maxI]);
		root.left = makeTree(nums, first, maxI);
		root.right = makeTree(nums, maxI + 1, last);
		return root;
	}

	private static int max(int[] nums, int first, int last) {
		int max = first;
		for (int i = first; i < last; i++) {
			if (nums[max] < nums[i]) {
				max = i;
			}
		}
		return max;
	}

}
