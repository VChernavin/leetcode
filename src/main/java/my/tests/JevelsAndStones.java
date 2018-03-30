package my.tests;

import java.util.HashSet;
import java.util.Set;


public class JevelsAndStones {

	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA","aAAbbbb"));
	}

	public static int numJewelsInStones(String J, String S) {
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
