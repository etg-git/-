package Recursive;

public class Palindrome {
	public static void main(String[] args) {
		String s = "ABCDEDCBA";
		System.out.println(palindrome(s, 0));
	}

	private static boolean palindrome(String s, int i) {

		if (i == s.length() / 2)
			return true;

		if ((int) s.charAt(i) == (int) s.charAt(s.length() - 1 - i))
			return palindrome(s, i + 1);

		else
			return false;
	}
	/*
	 * int cnt = 0;
	 * for (int j = 0; j < s.length() / 2; j++) {
	 * if ((int) s.charAt(i) == (int) s.charAt(s.length() - i -1)) cnt++;
	 * i++;
	 * if (cnt == s.length() / 2) return true;
	 * } return false; }
	 */
}
