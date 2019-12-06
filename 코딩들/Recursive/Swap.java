package Recursive;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		int n[] = { 3, 4 };
		System.out.println(Arrays.toString(n));
		swap(n[0], n[1]);
		System.out.println(Arrays.toString(n));
	}

	private static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
}
