package Stack;

import java.util.Stack;

public class Q2 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("��");
		stack.push("ȭ");
		stack.push("��");
		System.out.println("���� ��ü ����: " + stack);
		System.out.println("���� ũ��=" + stack.size());
		System.out.println("������ ��� �ִ°�? " + stack.isEmpty());
		String v;
		v = stack.peek(); // ������ top�� �ִ� �ڷḦ �������� �ʰ� �� ���� ��ȯ
		System.out.println("���� top ��ġ �ڷ� Ȯ��=" + v);
		System.out.println(stack.peek().equals("��"));
		v = stack.pop(); // ������ top�� �ִ� �ڷḦ ������ �� �� ���� ��ȯ
		System.out.println("���� top ��ġ �ڷ� ����=" + v);
		System.out.println("���� ��ü ����: " + stack);
		System.out.println("���� top ��ġ �ڷ� ����=" + stack.pop());
		System.out.println("���� ��ü ����: " + stack);
		System.out.println("���� top ��ġ �ڷ� ����=" + stack.pop());
		System.out.println("���� ��ü ����: " + stack);
		System.out.println("������ ��� �ִ°�? " + stack.isEmpty());
	}
}
