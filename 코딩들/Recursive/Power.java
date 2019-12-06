package Recursive;

public class Power {
	public static void main(String[] args) {
		int m = 2, n = 10;
		System.out.println(power(m, n));
	}

	private static long power(long m, long n) {
		if (n == 1)
			return m;
		return m * power(m, n - 1);
	}
}
