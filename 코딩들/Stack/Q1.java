package Stack;

import java.util.LinkedList;

public class Q1 {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<>(); // ���߿��Ḯ��Ʈ ����
		stack.addLast(1); // list.push(1)
		stack.addLast(2); // list.push(2)
		stack.addLast(3); // list.push(3)
		System.out.println("���� ��ü ����: " + stack);
		System.out.println("���� ũ��=" + stack.size());
		System.out.println("������ ��� �ִ°�? " + stack.isEmpty());
		int v;
		v = stack.getLast();
		System.out.println("���� top ��ġ �ڷ� Ȯ��=" + v);
		v = stack.removeLast(); // list.pop()
		System.out.println("���� top ��ġ �ڷ� ����=" + v);
		System.out.println("���� ��ü ����: " + stack);
		System.out.println("���� top ��ġ �ڷ� ����=" + stack.removeFirst());
		System.out.println("���� ��ü ����: " + stack);
		System.out.println("���� top ��ġ �ڷ� ����=" + stack.removeFirst());
		System.out.println("���� ��ü ����: " + stack);
		System.out.println("������ ��� �ִ°�? " + stack.isEmpty());

	}

}
