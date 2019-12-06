package Recursive;

public class Q9 {
	public static void main(String[] args) {
		int n[] = {5,1,8,3,2};
		System.out.println(sum(n, 0, n.length - 1));
	}

	private static long sum(int[] n, int low, int high) {
		if(low == high) return n[high];
		
		if(n[low] > sum(n, low+1, high)) return n[low];
		
		if(n[high] > sum(n, low, high-1)) return n[high];
		
		else return sum(n, low+1, high-1);
		
	}
}
