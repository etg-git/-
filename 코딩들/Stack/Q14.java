package Stack;

import java.util.Arrays;

public class Q14 {
	public static void main(String[] args) {
		SimpleStack stack = new SimpleStack(10); // ũ�� 10�� Stack ����

		// ���ÿ� 5 9 1 ���� ����
		stack.push(5);
		stack.push(9);
		stack.push(1);

		System.out.println(stack); // ���� ���

		int data = stack.pop(); // ���ÿ��� �ڷ� ����
		System.out.println("Data deleted from stack:" + data);

		System.out.println(stack); // ���� ���
	}

}
