package my.tests;

import java.util.List;

public class Substring {
	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		int max = 1;

		while (s.length() != 1) {
			String sub;
			int index = -1;
			for (int i = 1; i < s.length(); i++) {
				sub = s.substring(0, i);
				index = sub.indexOf(s.charAt(i));
				if (index == -1) {
					max = Math.max(max, sub.length() + 1);
				} else {
					s = s.substring(index+1);
					break;
				}

			}
//			if(index>=0){
//				s = s.substring(index+1);
//
//			}  else {
//				s=" ";
//			}

		}
		return max;
	}

	private List<String> findSubstrings(String s) {

		return null;
	}
}
