package Stack;

import java.util.Arrays;

public class Q15 {
	public static void main(String[] args) {
		 int n[]={1,2,3,4};
		 System.out.println(Arrays.toString(n));
		 int m[]=Arrays.copyOf(n, n.length*2); // 2�� Ȯ��
		 n=m;
		 System.out.println(Arrays.toString(n));
		 n=Arrays.copyOf(n, (int) (n.length*0.25)); // 1/4�� ���
		 System.out.println(Arrays.toString(n));
		 } 
}
