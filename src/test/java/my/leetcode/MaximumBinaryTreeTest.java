package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumBinaryTreeTest {

	@Test
	public void FirstTest() {
		MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();
		int[] nums = {3, 2, 1, 6, 0, 5};
		TreeNode node = new TreeNode(6);
		node.left = new TreeNode(3);
		node.left.right = new TreeNode(2);
		node.left.right.right = new TreeNode(1);
		node.right = new TreeNode(5);
		node.right.left = new TreeNode(0);
		assertEquals(node, maximumBinaryTree.constructMaximumBinaryTree(nums));
	}

	@Test
	public void EmtyTest() {
		MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();
		int[] nums = {};
		TreeNode node = null;
		assertEquals(node, maximumBinaryTree.constructMaximumBinaryTree(nums));
	}

	@Test
	public void EqualTest() {
		MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();
		int[] nums = {1, 1, 1, 1};
		TreeNode node = new TreeNode(1);
		node.right = new TreeNode(1);
		node.right.right = new TreeNode(1);
		node.right.right.right = new TreeNode(1);
		assertEquals(node, maximumBinaryTree.constructMaximumBinaryTree(nums));
	}

}
