package Recursive;

public class Fibona {
	public static void main(String[] args) {
		System.out.println(fibo(1));
	}

	private static long fibo(int n) {
		long n1 = 0, n2 = 1, n3 = 0;
		
		if(n < 2) return n;
		
		for (int i = 2; i <= n; i++) {
			
			n3 = n1 + n2;
			
			n1 = n2;
			
			n2 = n3;
		}
		
		return n3;
	}
}
