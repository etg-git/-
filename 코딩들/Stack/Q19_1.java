package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Q19_1 {
	public static void main(String[] args) {
		int price[] = { 100, 90, 100, 70, 100, 95, 110, 120 };
		int span[] = new int[price.length];

		for (int i = 0; i < price.length; i++) {
			int sum = 0;
			for (int j = i; j >= 0; j--) {
				if (price[i] < price[j])
					break;

				if (price[i] >= price[j])
					sum++;

			}
			span[i] = sum;
		}
		span[0] = 1;
		System.out.println(Arrays.toString(span));
	}
}
