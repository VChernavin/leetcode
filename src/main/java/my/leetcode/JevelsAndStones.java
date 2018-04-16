package my.leetcode;

import java.util.HashSet;
import java.util.Set;


public class JevelsAndStones {

	public int numJewelsInStones(String J, String S) {
		Set<Integer> set = new HashSet<>();
		for (char c : J.toCharArray()
				) {
			set.add((int)c);
		}
		int sum=0;
		for (char c : S.toCharArray()
				) {
			if (set.contains((int)c)) {
				sum++;
			}
		}

		return sum;
	}
}
