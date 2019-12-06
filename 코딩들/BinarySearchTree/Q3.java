package BinarySearchTree;

import java.util.TreeMap;

public class Q3 {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Korea", 32); // <key, value>�� <"Korea", 32>�� �ڷ� ����
		map.put("Japan", 50);
		map.put("China", 16);
		System.out.println(map);
		map.remove("Japan"); // key �� "Japan"�� �ش��ϴ� �ڷ� ����
		System.out.println(map);
		System.out.println(map.size()); // Ʈ�� �� �� �ڷ� ���� ��ȯ
		System.out.println(map.get("Korea")); // key �� "Korea"�� �����Ǵ� value ��ȯ
		System.out.println(map.get("Germany")); // key �� ���� �� null ��ȯ
	}
}
