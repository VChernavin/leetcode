package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseStringTest {
	@Test
	public void test1() {
		assertEquals("olleh",new ReverseString().reverseString("hello"));
	}

	@Test
	public void test2() {
		assertEquals("",new ReverseString().reverseString(""));
	}

	@Test(expected =NullPointerException.class)
	public void test3() {
		new ReverseString().reverseString(null);
	}
}
