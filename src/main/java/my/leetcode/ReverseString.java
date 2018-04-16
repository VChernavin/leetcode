package my.leetcode;

public class ReverseString {
	public String reverseString(String s) {
		int size = s.length();
		char[] chars = new char[size];
		for (int i = 0; i < size; i++) {
			chars[size - i - 1] = s.charAt(i);
		}
		return new String(chars);

	}
}
