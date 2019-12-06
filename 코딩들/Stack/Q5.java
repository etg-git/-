package Stack;

import java.util.Stack;

public class Q5 {
	public static void main(String[] args) {
		String s = "()()()";
		System.out.println(checkParen(s));
	}

	private static boolean checkParen(String s) {
		Stack<Character> stack = new Stack<>();

		for (Character c : s.toCharArray()) {
			if (c.equals('(')) {
				stack.push(c);
			}
			else if (c.equals(')')) {

				if (stack.isEmpty())
					return false;

				else if (stack.peek().equals('('))
					stack.pop();
			}
		}
		
		// System.out.println(stack);
		
		return stack.isEmpty();

	}
}
