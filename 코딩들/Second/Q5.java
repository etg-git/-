package Second;

import java.util.LinkedList;
import java.util.Random;

public class Q5 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		Random rd = new Random();

		int x = 0;

		for (int i = 1; i <= 1000000; i++) {
			int v = rd.nextInt(101);
			list.add(v);
		}
		System.out.println(list.get(99999));
	}
}
