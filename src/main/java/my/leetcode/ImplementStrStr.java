package my.leetcode;

public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
		if (needle.equals("")) {
			return 0;
		}
		int j = 0 ;
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(j)) {

				if (j == needle.length()-1) {
					return i-j;
				}
				j++;
			}else {
				j = 0;
			}
		}

		return -1;
	}
}
