	package First;

import java.util.Arrays;
import java.util.Scanner;

public class Q26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String v = sc.nextLine().replaceAll(" ", "");

		int[] N = new int[v.length()];
		int max = 0;

		int sum = 0;

		for (int i = 0; i < v.length(); i++) {
			N[i] = (int) v.charAt(i) - '0';

		}
		Arrays.sort(N);

//		System.out.println(Arrays.toString(N));

		for (int i = 1; i < N.length; i++) {
			if (N[i] == N[i - 1])
				continue;

			System.out.print(N[i - 1] + " ");

		}
		System.out.println(N[N.length-1]);
	}
}
