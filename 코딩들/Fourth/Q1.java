package Fourth;

public class Q1 {
	public static void main(String[] args) {
		long v[] = { 34, 76, 11, 3, 7, 13, 9 };

		int x = 1;
		long min = v[1] - v[0]; 
		
		for (int i = 0; i < v.length; i++) {

			if (i == v.length - 1)
				continue;

			for (int j = x; j < v.length; j++) {

				if (min > Math.abs(v[i] - v[j]))

					min = Math.abs(v[i] - v[j]);

			}
			x++;
		}
		System.out.println(min);
	}
}
