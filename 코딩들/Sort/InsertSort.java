package Sort;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int v[] = new int[] { 3, 4, 5, 2, 1};
		insertionSort(v);
		System.out.println(Arrays.toString(v));
	}

	private static void insertionSort(int[] v) {
		for (int i = 1; i < v.length; i++) {
			int x = v[i];
			for (int j = i; j > 0 && v[j - 1] > v[j]; j--) {
				v[j] = v[j - 1];
			}
			v[i - 1] = x;
		}
	}
}
