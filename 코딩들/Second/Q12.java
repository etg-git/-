package Second;

import java.util.LinkedList;

public class Q12 {
	public static void main(String[] args) {
		long start;
		int N = 10000; // �ڷ� ����
		int s[] = new int[N]; // �迭 ����
		LinkedList<Integer> list = new LinkedList<>(); // ����Ʈ ����
		start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			for (int j = i - 1; j >= 0; j--)
				s[j + 1] = s[j]; // �迭 �ڷ� ��ü ������ ��ĭ �̵�
			s[0] = i; // �迭 0��° ��ġ�� �ڷ� ����
		}
		System.out.println((System.currentTimeMillis() - start) + " ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < N; i++)
			list.addFirst(i); // ���Ḯ��Ʈ 0��° ��ġ�� �ڷ� ����
		System.out.println((System.currentTimeMillis() - start) + " ms");
	}
}
