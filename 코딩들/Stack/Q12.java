package Stack;

import java.util.Arrays;

public class Q12 {
	public static void main(String[] args) {
		int stack[] = new int[5]; // ũ�� 5�� ���� ����
		int top = -1;
		// ���ÿ� 5, 9, 1�� ���ʷ� ����(push)
		stack[++top] = 5;
		stack[++top] = 9;
		stack[++top] = 1;
		System.out.println(Arrays.toString(stack) + ", top=" + top + ", ���� ũ��=" + (top + 1));
		System.out.println("������ ��� �ִ°�? " + (top == -1));
		System.out.println("���� peek: " + stack[top]); // ���� top Ȯ�� peek
		System.out.println("���� pop: " + stack[top--]); // ���ÿ��� �ڷ� ����(pop)
		System.out.println(Arrays.toString(stack) + ", top=" + top + ", ���� ũ��=" + (top + 1));
		System.out.println("���� pop: " + stack[top--]); // ���ÿ��� �ڷ� ����(pop)
		System.out.println(Arrays.toString(stack) + ", top=" + top + ", ���� ũ��=" + (top + 1));
		System.out.println("���� pop: " + stack[top--]); // ���ÿ��� �ڷ� ����(pop)
		System.out.println(Arrays.toString(stack) + ", top=" + top + ", ���� ũ��=" + (top + 1));
		System.out.println("������ ��� �ִ°�? " + (top == -1));
	}
}
