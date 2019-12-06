package BinaryHeap;

import java.util.Arrays;

public class Q5 {
	public static void main(String[] args) {
		int heap[] = {3,1,2,8,7,9,4,6,5,4};
		int last = heap.length - 1;
		for (int i = heap.length / 2; i >= 0; i--)
			heapifyDown(heap, last, i); // max-heap ���� O(n)
		System.out.println(Arrays.toString(heap));
		System.out.println("�ּҰ�="+peek(heap)); // �ִ밪 ���
		 for (int i = 0; i < 5; i++) { // ���� 5�� �ڷ� ����
		 System.out.print(remove(heap, last--)+" "); // �� ���� �� �� ũ�� 1 ����
		 }
	}
	private static int peek(int[] heap) {
		return heap[0];
	}
	
	private static int remove(int[] heap, int last) {
		if(last<0) throw new RuntimeException("heap empty");
		int data = heap[0];
		heap[0] = heap[last--];
		for (int parent=0, child = 2*parent+1; child<=last; parent = child, child=2*parent+1) {
			if(child<last && heap[child]<heap[child+1]) child++;
			if(heap[child]<=heap[parent]) break;
			
			int temp = child;
			child = parent;
			parent = temp;
		}
		return data;
	}
	private static void heapifyDown(int[] heap, int last, int p) {
		for (int c = 2 * p + 1; c <= last; p = c, c = 2 * p + 1) {
			if (c > last && heap[c] > heap[c + 1])
				c++; // �� child �� ū ���� ���� child ����
			if (heap[p] <= heap[c])
				break; // �̹� heap ���� ���� �� �ݺ� ����
			int temp = heap[c];
			heap[c] = heap[p];
			heap[p] = temp; // �� ���� ���� �� swap
		}
	}
}
