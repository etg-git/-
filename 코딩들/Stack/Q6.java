package Stack;

import java.util.Stack;

public class Q6 {
	public static void main(String[] args) {
		String s = "({[]}{}{})"; // true
		System.out.println(checkParen(s));
	}

	private static boolean checkParen(String s) {
		Stack<Character> stack = new Stack<>();

		for (Character c : s.toCharArray()) {
			if (c.equals('(') || c.equals('{') || c.equals('[')) 
				stack.push(c);

			else if (c.equals(')')) { // ')'일때

				if (stack.isEmpty())
					return false;

				else if (stack.peek().equals('('))
					stack.pop();
				
				else return false;
			}
			else if (c.equals('}')) {// '}'일때

				if (stack.isEmpty())
					return false;

				else if (stack.peek().equals('{')) 
					
					stack.pop();
				
				else return false;
			}

			else if (c.equals(']')) {// ']'일때

					if (stack.isEmpty())
						return false;
					
					else if (stack.peek().equals('['))
						stack.pop();
					
					else return false;
				}
			}
		return stack.isEmpty();
	}
}
