package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayPartitionITest {
	@Test
	public void test1() {
		assertEquals(4, new ArrayPartitionI().arrayPairSum(new int[] {1, 4, 3, 2}));
	}

	@Test
	public void test2() {
		assertEquals(0, new ArrayPartitionI().arrayPairSum(new int[] {}));
	}
}
