package Second;

import java.util.LinkedList;

public class Q11 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1); // list.addLast(1)¿Í µ¿ÀÏ
		list.add(2);
		list.add(3);
		list.addFirst(7);
		System.out.println(list);
	}
}
