package First;

import java.util.Random;

public class Q14 {
	public static void main(String[] arg) {
		Random ran = new Random();

		for (int i = 0; i < 20; i++) {
			int a = ran.nextInt(6) + 1;
			System.out.print(a + " ");
		}
	}
}
