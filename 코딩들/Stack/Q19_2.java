package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Q19_2 {
	public static void main(String[] args) {
		int price[] = { 100, 90, 80, 70, 85, 95, 110, 120 };
		int span[] = new int[price.length];
		
		for (int i = 0; i < price.length; i++) {
			Stack<Integer> st = new Stack<>();
			int sum = 0;
			int j =0;
			while (j <= i) {
				st.push(price[j]);
				
				j++;
			}
			
			while (!st.isEmpty()) {
				
				if (price[i] >= st.pop()) {
					sum++;

				} else
					break;
			}
			
			span[i] = sum;
			
		}
	
			System.out.println(Arrays.toString(span));
	}
}
