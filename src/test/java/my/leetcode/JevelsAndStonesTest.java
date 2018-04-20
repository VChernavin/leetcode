package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JevelsAndStonesTest {
	@Test
	public void test() {
		assertEquals(3, new JevelsAndStones().numJewelsInStones("aA", "aAAdwed"));
	}
}
