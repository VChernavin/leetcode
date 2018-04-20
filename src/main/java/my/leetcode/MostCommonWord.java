package my.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
	private int max;
	private String res;
	private Set<String> banedSet;

	public String mostCommonWord(String paragraph, String[] banned) {
		if (paragraph == null || paragraph.equals("")) {
			return "";
		}
		max = 0;
		res = null;
		banedSet = new HashSet<>(Arrays.asList(banned));
		String[] words = paragraph.split("\\W");
		Map<String, Integer> wordsCount = new HashMap<>();

		for (String word : words) {
			wordsCount.compute(word.toLowerCase(), this::worldCountBiFunction);

		}

		return res;
	}

	private Integer worldCountBiFunction(String key, Integer value) {
		if (key.equals("") || banedSet.contains(key)) {
			return 0;
		}
		int newVal = value == null ? 1 : value + 1;
		if (newVal > max) {
			max = newVal;
			res = key;
		}
		return newVal;
	}
}
