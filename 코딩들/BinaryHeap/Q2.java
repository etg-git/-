package BinaryHeap;

import java.util.PriorityQueue;

public class Q2 {
	public static void main(String[] args) {
		int v[] = { 4, 2, 9, 5, 7, 5, 8, 10, 15 };
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < v.length; i++) {
			pq.add(v[i]);
			System.out.println(pq);
		}
		System.out.println("�ּҰ�=" + pq.peek()); // �������� �ʰ� ť�� root�� ��ȯ
		for (int i = 0; i < v.length; i++) {
			System.out.println(pq.remove() + "=>" + pq);
		}
	}
}
