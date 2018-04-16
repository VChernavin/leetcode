package my.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayPartitionI {
	public int arrayPairSum(int[] nums) {
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < nums.length ; i++) {
			l.add(nums[i]);
		}
		Collections.sort(l);
		int res=0;
		for (int i = 0; i < l.size() ; i+=2) {
			res += Math.min(l.get(i),l.get(i+1));
		}
		return res;
	}
}
