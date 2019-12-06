package Stack;

import java.util.Stack;

public class Q10 {
	public static void main(String[] args) {
		String e = "3 1 2 / *";
		System.out.println(postfixEval(e));
	}

	private static double postfixEval(String e) {
		Stack<Double> stack = new Stack<>();
		double n1 = 0;
		double n2 = 0;
		
		for (String token : e.split("\\s+")) {
			char ch = token.charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				n1 = stack.pop();
				n2 = stack.pop();
				System.out.println(ch);
				switch (ch) {
				case '+':
					stack.push(n1 + n2);
					break;
				case '-':
					stack.push(n1 - n2);
					break;
				case '*':
					stack.push(n1 * n2);
					break;
				case '/':
					stack.push(n1 / n2);
					break;

				}
			} else {
				stack.push((double) ch - '0');
			}
		}
		return stack.pop();
	}
}
