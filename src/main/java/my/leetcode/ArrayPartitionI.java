package my.leetcode;

import java.util.Arrays;

public class ArrayPartitionI {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int res = 0;
		for (int i = 0; i < nums.length; i += 2) {
			res += Math.min(nums[i], nums[i + 1]);
		}
		return res;
	}
}
