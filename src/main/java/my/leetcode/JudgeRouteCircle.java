package my.leetcode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JudgeRouteCircle {

	public boolean judgeCircle(String moves) {
		Collection<Character> textInChar = moves.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		Map<Character, Integer> countedMoves = textInChar.stream().collect(HashMap::new, (m, c) -> {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}, HashMap::putAll);

		return countedMoves.getOrDefault('U', 0).equals(countedMoves.getOrDefault('D', 0)) &&
				countedMoves.getOrDefault('L', 0).equals(countedMoves.getOrDefault('R', 0));
	}
}
