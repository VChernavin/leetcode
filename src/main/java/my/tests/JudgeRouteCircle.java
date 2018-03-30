package my.tests;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class JudgeRouteCircle {

	public static void main(String[] args) {

		System.out.println(new JudgeRouteCircle().judgeCircle("LLRR"));
	}


	public boolean judgeCircle(String moves) {
		Collection<Character> textInChar = moves.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
		Map<Character, Integer> countedMoves = textInChar.stream().collect(HashMap::new, (m, c) -> {
			if(m.containsKey(c))
				m.put(c, m.get(c) + 1);
			else
				m.put(c, 1);
		}, HashMap::putAll);
		countedMoves.forEach( (k, v) -> System.out.println(k + " -> " + v));

		return countedMoves.getOrDefault('U',0).equals(countedMoves.getOrDefault('D',0))&&
				countedMoves.getOrDefault('L',0).equals(countedMoves.getOrDefault('R',0));
	}
}
