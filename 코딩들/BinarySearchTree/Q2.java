package BinarySearchTree;

import java.util.TreeSet;

public class Q2 {
	public static void main(String[] args) {
		int n[] = { 50, 20, 70, 10, 30, 5, 15, 25, 60, 90, 62, 65, 64, 35 };
		TreeSet<Integer> tree = new TreeSet<>();
		for (int i = 0; i < n.length; i++)
			tree.add(n[i]); // ����Ž��Ʈ���� �ڷ� ����
		System.out.println(tree);
		System.out.println(tree.size()); // Ʈ�� �� �� �ڷ� ���� ��ȯ
		tree.remove(20); // key �� 20 ����
		System.out.println(tree);
		System.out.println(tree.contains(30)); // key �� 30�� �����ϴ� ��� true ��ȯ
		System.out.println(tree.contains(33)); // key �� 33�� �������� �ʴ� ��� false ��ȯ
		System.out.println(tree);
	}
}
