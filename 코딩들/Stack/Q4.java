package Stack;

import java.util.LinkedList;

public class Q4 {
	public static void main(String[] args) {
		String s = "���ѹα��� ������ �����̴�.";
		LinkedList<Character> stack = new LinkedList<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			stack.addFirst(c);
		}
		
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stack.removeFirst());
		}
	}
}
