package Second;

import java.util.Arrays;

public class Q13 {
	public static void main(String[] args) {
		 char s[]= {'ȭ','��','��','��','��','��'};
		 System.out.println(Arrays.toString(s)); // ���� ��
		 char t[]=new char[s.length+1];
//		 System.arraycopy(s, 0, t, 1, s.length);
		 
		 for (int i = 0; i < s.length; i++) {
			t[i+1] = s[i];
		}
		 t[0]='��';
		 
		 s=t; 
		 
		 System.out.println(Arrays.toString(s)); // ���� ��
		 }
}
