package First;

import java.util.Scanner;

public class Q23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String v = sc.nextLine().replaceAll(" ", "");

		int[] N = new int[v.length()+1];
		int max = 0;

		for (int i = 0; i < v.length(); i++) {
			N[i] = v.charAt(i) - '0';

			if (max < N[i]) {
				max = N[i];
			}
		}

		int imp = 0;

		for (int k = 0; k < N.length; k++) {
			if (max == N[k])
				imp++;
		}

		int max2 = 0;
		for (int j = 0; j < N.length; j++) {
			if (max == N[j])
				continue;

			if (imp > 1)
				max2 = max;

			else if (max2 < N[j]) {
				max2 = N[j];

			}
		}
		System.out.println(max2);

	}
}