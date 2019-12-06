package Queue;

import java.util.LinkedList;

public class Josephus {
	public static void main(String[] args) {
		System.out.println(solveJosephusProblem(7, 3));
	}

	private static int solveJosephusProblem(int n, int k) {

		LinkedList<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			queue.addLast(i);
		}

		while (queue.size() > 1) {

			for (int j = 0; j < k-1; j++) {
				queue.addLast(queue.removeFirst());
			}
		
//			System.out.println("queue"  + queue);
			queue.removeFirst();
		
		}
		return queue.get(0);
	}
}
