package BinaryHeap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Q3 {
	public static void main(String[] args) {
		int v[] = { 4, 2, 9, 5, 7, 5, 8, 10, 15 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < v.length; i++)
			list.add(v[i]);
		PriorityQueue<Integer> pq = new PriorityQueue<>(list); // �ּ��� ����
		System.out.println("�ּҰ�=" + pq.peek()); // �������� �ʰ� ť�� root�� ��ȯ
		for (int i = 0; i < v.length; i++) {
			System.out.println(pq.remove() + "=>" + pq);
		}
	}
}
