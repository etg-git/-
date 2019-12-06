package Recursive;

public class ToUpper {
	public static void main(String[] args) {
		String s = "South, Korea ¾È³ç";
		char v[] = s.toCharArray();
		toUpper(v, 0);
		System.out.println(v);
	}

	private static void toUpper(char[] v, int i) {
		int Ascii = (int) v[i];
		
		if (Ascii >= 97 && Ascii <= 122) {

			Ascii = Ascii - 32;

			v[i] = (char) Ascii;
		}
		if(i < v.length-1) 
		toUpper(v, i+1);
		
	}
}
