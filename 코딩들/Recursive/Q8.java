package Recursive;

public class Q8 {
	public static void main(String[] args) {
		 int n[]={5,1,10,3,12};
		 System.out.println(max(n, n.length-1));
		 }
		private static int max(int[] n, int i) {
			if(i==0) return n[i];
			
			if(n[i] > max(n, i-1)) return n[i]; 
				
			else return max(n,i-1);
			
			
			// return (v1>v2)?v1:v2;
		 } 
}
