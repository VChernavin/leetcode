package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImplementStrStrTest {
	@Test
	public void test1() {
		assertEquals(2, new ImplementStrStr().strStr("hello", "ll"));

	}

	@Test
	public void test2() {
		assertEquals(-1, new ImplementStrStr().strStr("aaaaa", "bba"));

	}

	@Test
	public void test3() {

		assertEquals(-1, new ImplementStrStr().strStr("mississippi", "issipi"));

	}
}
