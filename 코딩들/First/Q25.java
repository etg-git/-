package First;

import java.util.Arrays;
import java.util.Scanner;

public class Q25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String v = sc.nextLine().replaceAll(" ", "");

		int[] N = new int[v.length()];
		int max = 0;
		
		for (int i = 0; i < v.length(); i++) {
			N[i] = (int) v.charAt(i) - '0';
		}

		Arrays.sort(N);

		if(v.length()%2 == 1) {
			System.out.println(N[v.length()/2]);
		}
		else if(v.length()%2 == 0) {
			System.out.println((double) (N[v.length()/2]+N[v.length()/2-1])/2);
		}
	}
}
