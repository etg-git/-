package Stack;

import java.util.Stack;

public class Q7 {
	public static void main(String[] args) {
		int n1, n2;
		Stack<Integer> stack = new Stack<>();
		stack.push(3); // �ǿ����� 3 => push
		stack.push(4); // �ǿ����� 4 => push
		stack.push(5); // �ǿ����� 5 => push
		// ������ +
		n2 = stack.pop();
		n1 = stack.pop();
		stack.push(n1 + n2);
		// ������ *
		n2 = stack.pop();
		n1 = stack.pop();
		stack.push(n1 * n2);
		System.out.println("�����=" + stack.pop());
	}
}
