package Second;

import java.util.Arrays;

public class Q9 {
	public static void main(String[] args) {
		int n[] = { 3, 4, 5, 6, 7, 0, 0, 0, 0, 0 };

		for (int i = 4; i >= 0; i--)
			n[i + 1] = n[i]; // n[0..4]�� n[1..5]�� �̵�
		n[0] = 2; // n[0]�� 2�� ����
		System.out.println(Arrays.toString(n)); // [2,3,4,5,6,7,0,0,0,0]
	}

}
