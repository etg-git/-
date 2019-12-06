package Search;

import java.util.Arrays;

public class Q3 {
	public static void main(String[] args) {
		int v[] = { 2, 3, 5, 6, 8 , 9 };
		Arrays.sort(v); // �迭 ����
		int key = 8;
		int index = binarySearch(v, key, 0, v.length-1); // ���ĵ� �迭 �� �ڷ� ��ġ ���� Ž��
		if (index < 0)
			System.out.println("�迭 �� �ڷ� ����");
		else
			System.out.println("�ڷ� �߰� ��ġ(�迭 �� index): " + index);
	}

	private static int binarySearch(int[] v, int key, int left, int right) {
		while (left <= right) {
			int m = left + (right - left) / 2;
			if (key == v[m])
				return m;
			if (key < v[m])
				return binarySearch(v, key, left, m-1);
			else
				return binarySearch(v, key, m+1, right);
		}
		return -1;
	}
}
