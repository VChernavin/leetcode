package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidateBinarySearchTreeTest {
	@Test
	public void trueTest() {
		TreeNode node = new TreeNode(2);
		node.left = new TreeNode(1);
		node.left.right = new TreeNode(3);
		assertTrue(new ValidateBinarySearchTree().isValidBST(node));
	}

	@Test
	public void nullTest() {
		assertTrue(new ValidateBinarySearchTree().isValidBST(null));
	}

	@Test
	public void falseLeftTest() {
		TreeNode node = new TreeNode(10);
		node.left = new TreeNode(5);
		node.right = new TreeNode(15);
		node.right.left = new TreeNode(6);
		node.right.right = new TreeNode(20);
		assertFalse(new ValidateBinarySearchTree().isValidBST(node));
	}

	@Test
	public void falseRightLeftTest() {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(1);
		node.right = new TreeNode(5);
		node.right.left = new TreeNode(4);
		node.right.right = new TreeNode(6);
		node.left.left = new TreeNode(0);
		node.left.right = new TreeNode(2);
		assertFalse(new ValidateBinarySearchTree().isValidBST(node));
	}

	@Test
	public void falseDublicateTest() {
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(1);
		node.right = new TreeNode(5);
		node.right.left = new TreeNode(4);
		node.right.right = new TreeNode(6);
		node.left.left = new TreeNode(0);
		node.left.right = new TreeNode(2);
		node.left.right.right = new TreeNode(3);
		assertFalse(new ValidateBinarySearchTree().isValidBST(node));
	}



}
