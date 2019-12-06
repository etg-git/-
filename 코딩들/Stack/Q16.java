package Stack;

import java.util.Arrays;

public class Q16 {
	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(n));
		int m[] = arrayCopy(n, n.length * 2); // 2�� Ȯ��
		n = m;
		System.out.println(Arrays.toString(n));
		n = arrayCopy(n, (int) (n.length * 0.25)); // 1/4�� ���
		System.out.println(Arrays.toString(n));
	}

	private static int[] arrayCopy(int[] n, int newSize) {
		int[] newArray = new int[newSize];
		
		if (newSize >= n.length) {	
			for(int i = 0; i<n.length; i++) {
				newArray[i] = n[i];
			}
		}
		else if(newSize <= n.length) {
			for(int i =0; i<newArray.length; i++) {
				newArray[i] = n[i];
			}
		}
		
		return newArray;
	}
}
