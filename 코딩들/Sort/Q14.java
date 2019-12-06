package Sort;

import java.util.Arrays;

public class Q14 {
	public static void main(String[] args) {
		int v[] = { 87,95,53,77,100,95,14};
		sort(v);
		System.out.println(Arrays.toString(v));
	}

	private static void sort(int[] v) {
		int n[] = new int[101];
		
		for (int i = 0; i < v.length; i++) n[v[i]]++;
		for (int i = 0, k=0; i < n.length; i++) {	
			for (int j = 0; j < n[i]; j++) v[k++] = i;	
		}
	}
}
