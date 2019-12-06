package First;

import java.util.Scanner;

public class Q24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String v = sc.nextLine().replaceAll(" ", "");

		int[] N = new int[100];
		int max = 0;

		for (int i = 0; i < v.length(); i++) {
			N[i] = v.charAt(i) - '0';

			if (max < N[i]) {
				max = N[i];
			}
		}

		int max2 = 0;
		for (int j = 0; j < N.length; j++) {
			if (max == N[j])
				continue;

			else if (max2 < N[j]) {
				max2 = N[j];

			}
		}
		if(max2==0) System.out.println("None");
		
		else
		System.out.println(max2);

	}
}
