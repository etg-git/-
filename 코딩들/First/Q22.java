package First;

import java.util.Scanner;

public class Q22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String v = sc.nextLine().trim();
		
		int[] N = new int[100];
		int max = 0;
		for(int i=0; i<v.length(); i++) {
			N[i] = v.charAt(i) - '0';
			
			if(max < N[i]) max = N[i];
		}
		
		
	/*	while (sc.hasNextInt()) {
			N[i] = sc.nextInt();

			if (max < N[i]) {
				max = N[i];
			}
			
			i++;
		}
		System.out.println(max);
		*/
		int max2 = 0;
		for (int b = 0; b < N.length; b++) {
			if (N[b] == max)
				continue;

			if (max2 < N[b])
				max2 = N[b];
			
		}
		
		System.out.println(max2);
	}
}
