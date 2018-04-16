package my.leetcode;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

public class RemoveElementTest {
	@Test
	public void test1() {
		int[] expected = new int[] {2, 2};
		int[] input = new int[] {3, 2, 2, 3};
		int len = new RemoveElement().removeElement(input, 3);
		int[] res = new int[len];
		for (int i = 0; i < len; i++) {
			res[i] = input[i];
		}
		assertThat(expected, is(res));
	}

	@Test
	public void test2() {
		assertEquals(0, new RemoveElement().removeElement(new int[] {}, 3));

	}
}
