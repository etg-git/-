package First;

import java.util.Arrays;
import java.util.Scanner;

public class Q27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String v = sc.nextLine().replaceAll(" ", "");

		int[] N = new int[v.length()];
		int[] M = new int[v.length()];
		
		int x = 0;
		for (int i = 0; i < v.length(); i++) {
			N[i] = (int) v.charAt(i) - '0';
		}
		Arrays.sort(N);
		for (int i = N.length - 1; i >= 0; i--) {
			System.out.print(N[i] + " ");
		}
		System.out.println();
		
		int max = 1;
		
		
		System.out.print(max + " ");
		for (int i = N.length - 1; i > 0; i--) {
			
			if(N[i-1] == N[i]) max = max;
			
			else max ++;
			
			System.out.print(max + " ");
		}
	}
}
