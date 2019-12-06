package Recursive;

public class CountUpper {
	public static void main(String[] args) {
		String s = "South, Korea";
		char v[] = s.toCharArray();
		System.out.println(countUpper(v, 0));
	}
	private static int countUpper(char[] v, int i) {
		int cnt = 0;
		
		if(i > v.length-1) return cnt;
		
		if((int)v[i] >= 65 && (int)v[i] <= 90) 
			cnt++;
		
		return cnt + countUpper(v, i+1);
		
	}
}
