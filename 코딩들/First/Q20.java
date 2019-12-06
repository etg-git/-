package First;

public class Q20 {
	public static void main(String[] args) {
		int[] M = new int[100];
		
		
		int N = 0;
		
		int sum = 0;
		for(int i=0; i<100; i++) {
			M[i] = N;
			
			N++;
			
			sum += M[i];
		}
		
		double a = sum/100;
		
		double b = Double.parseDouble(String.format("%.2f" , a));
		
		System.out.print(b);
	}
}
