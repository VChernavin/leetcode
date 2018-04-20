package my.leetcode;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HammingDistanceTest {
	@Test
	public void test0() {
		assertEquals(0, new HammingDistance().hammingDistance(0, 0));
	}

	@Test
	public void test1() {
		assertEquals(2, new HammingDistance().hammingDistance(1, 4));
	}

	@Test
	public void test2() {
		assertEquals(1, new HammingDistance().hammingDistance(1, 3));
	}

	@Test
	public void test4() {
		assertEquals(3, new HammingDistance().hammingDistance(1, 10));
	}

}
