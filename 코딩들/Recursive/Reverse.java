package Recursive;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		reverse(n, 0);
		System.out.println(Arrays.toString(n));
	}

	private static void reverse(int[] n, int i) {
		int temp = 0;
		
		if (n.length == 1)
			reverse(n, i);

		if (i < n.length / 2) {

			temp = n[i];

			n[i] = n[n.length - i - 1];

			n[n.length - i - 1] = temp;

			reverse(n, i + 1);

		}
	}
}
