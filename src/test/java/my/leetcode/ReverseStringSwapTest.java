package my.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseStringSwapTest {
	@Test
	public void test1() {
		assertEquals("olleh", new ReverseStringSwap().reverseString("hello"));
	}

	@Test
	public void test2() {
		assertEquals("", new ReverseStringSwap().reverseString(""));
	}

	@Test(expected = NullPointerException.class)
	public void test3() {
		new ReverseStringSwap().reverseString(null);
	}
}
