package my.leetcode;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class MaximumBinaryTree {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return makeTree(nums, 0, nums.length);
	}
	public TreeNode makeTree(int[] nums, int first, int last) {
		if (first == last)
			return null;
		int max_i = max(nums, first, last);
		TreeNode root = new TreeNode(nums[max_i]);
		root.left = makeTree(nums, first, max_i);
		root.right = makeTree(nums, max_i + 1, last);
		return root;
	}
	public int max(int[] nums, int first, int last) {
		int max = first;
		for (int i = first; i < last; i++) {
			if (nums[max] < nums[i])
				max = i;
		}
		return max;
	}




}
