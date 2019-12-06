package Recursive;

public class GCD {
	public static void main(String[] args) {
		System.out.println(gcd(64, 48));
	}

	private static int gcd(int a, int b) {

		while (b > 0) {
			int temp = a;
			
			a = b;
			
			b = temp % b;

		}

		return a;

		/*
		 * if(b==0) return a;
		 * 
		 * else return gcd(b, a%b);
		 */
	}
}
