package my.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JudgeRouteCircleTest {
	@Test
	public void testTrue() {
		assertTrue(new JudgeRouteCircle().judgeCircle("UD"));
	}

	@Test
	public void testFalse() {
		assertFalse(new JudgeRouteCircle().judgeCircle("LL"));
	}
}
