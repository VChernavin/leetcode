package my.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Substring {

	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		int max = 0;
		char[] charArray = s.toCharArray();
		int n = s.length();
		Map<Character, Integer> map = new HashMap<>();
		int j = 0;
		for (int i = 0; j < n; j++) {
			if (map.containsKey(charArray[j])) {
				i = Math.max(map.get(charArray[j]), i);
			}
			max = Math.max(max, j - i + 1);
			map.put(charArray[j], j + 1);
		}
		return max;
	}

}
