package First;

import java.util.Random;

public class Q15 {
	public static void main(String[] args) {
		Random ran = new Random();

		int[] sum = new int[6];

		int b = 1;
		
		int c = 0;
		String v = "";
		while (b <= 6000) {
			int a = ran.nextInt(6) + 1;
			switch (a) {
			case 1:
				sum[0] = sum[0] + 1;break;

			case 2:
				sum[1] = sum[1] + 1;break;

			case 3:
				sum[2] = sum[2] + 1;break;
				
			case 4:
				sum[3] = sum[3] + 1;break;
				
			case 5:
				sum[4] = sum[4] + 1;break;

			case 6:
				sum[5] = sum[5] + 1;break;
			}
			b++;
		}
		for(int i : sum) {
			if(c == 5) 
				v = v + i + "";
			
			
			else v = v + i + ", ";
			
			c++;
		}
		System.out.print("[" + v + "]");
	}
}
