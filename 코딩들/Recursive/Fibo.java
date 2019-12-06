package Recursive;

public class Fibo {
	public static void main(String[] args) {
		System.out.println(fibo(50));
	}

	private static long fibo(int n) {
		long memo[] = new long[n+1];
		return fiboMemo(n, memo);
	}
	
	private static long fiboMemo(int n, long[] memo) {
		if(memo[n] > 0) return memo[n];
		if(n<2) return n;
		return memo[n] = fiboMemo(n-2, memo) + fiboMemo(n-1, memo);
	}
}
