package my.leetcode;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SearchForARangeTest {
	@Test
	public void test1() {
		int[] expected = new int[] {3,4};
		int[] nums = new int[] {5,7,7,8,8,10};
		assertThat(expected,is(new SearchForARange().searchRange(nums,8)));
	}

	@Test
	public void test2() {
		int[] expected = new int[] {-1,-1};
		int[] nums = new int[] {5,7,7,8,8,10};
		assertThat(expected,is(new SearchForARange().searchRange(nums,6)));
	}
}
