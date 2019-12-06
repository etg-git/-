package Fourth;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		long v[] = { 34, 76, 11, 3, 7, 13, 9 };

		Arrays.sort(v);

		long min = v[1] - v[0];

		for (int i = 0; i < v.length; i++) {
			if (i == v.length - 1)
				continue;

			else if (min > Math.abs(v[i] - v[i + 1]))

				min = Math.abs(v[i] - v[i + 1]);

		}
		System.out.println(min);
	}
}
