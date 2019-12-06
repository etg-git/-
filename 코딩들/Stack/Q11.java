package Stack;

import java.util.Stack;

public class Q11 {
	public static void main(String[] args) {
		String e = "34 12 25/*";
		System.out.println(postfixEval(e));
	}

	private static double postfixEval(String e) {
		Stack<Double> stack = new Stack<>();
		
		return stack.pop();
	}
}
