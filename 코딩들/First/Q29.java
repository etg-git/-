package First;

import java.util.Scanner;

public class Q29 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("������ ����  : ");
		String v = sc1.nextLine().replaceAll(" ", "");
		
		System.out.print("ȸ�� �� ��  : ");
		int k = sc2.nextInt();
		
		int[] N = new int[v.length()];
		
		int[] K = new int[v.length()];
		
		for (int i = 0; i < N.length; i++) {
			N[i] = (int) v.charAt(i) - '0';
			
			K[(i+k)%N.length] = N[i];
		}
		
		for (int i = 0; i < N.length; i++) {
			System.out.print(K[i] + " ");
		}
		
	}
}
