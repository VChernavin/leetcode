package my.leetcode;

import java.util.HashSet;
import java.util.Set;

public class JevelsAndStones {

	public int numJewelsInStones(String j, String s) {
		Set<Integer> set = new HashSet<>();
		for (char c : j.toCharArray()) {
			set.add((int) c);
		}
		int sum = 0;
		for (char c : s.toCharArray()) {
			if (set.contains((int) c)) {
				sum++;
			}
		}

		return sum;
	}
}
