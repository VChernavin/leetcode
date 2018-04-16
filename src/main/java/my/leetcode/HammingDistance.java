package my.leetcode;

import java.util.ArrayList;
import java.util.List;

public class HammingDistance {



	public int hammingDistance(int x, int y) {
		List<Integer> b1 = intToBinarList(x);
		List<Integer> b2 = intToBinarList(y);
		int max = Math.max(b1.size(), b2.size());
		while (b1.size() < max) {
			b1.add(0);
		}
		while (b2.size() < max) {
			b2.add(0);
		}
		int distance = 0;
		for (int i = 0; i < b1.size(); i++) {
			if (!b1.get(i).equals( b2.get(i))) {
				distance++;
			}
		}
		return distance;
	}

	private static List<Integer> intToBinarList(int i) {
		List<Integer> binList = new ArrayList<>();
		while (i != 0) {
			int tmp = i % 2;
			binList.add(tmp);
			i = i / 2;
		}
		return binList;
	}
}
