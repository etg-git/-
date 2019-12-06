package Stack;

public class Q18 {
	public static void main(String[] args) {
		SimpleStackQ18<Integer> stack1 = new SimpleStackQ18<>();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		System.out.println(stack1);

		SimpleStackQ18<String> stack2 = new SimpleStackQ18<>();
		stack2.push("K");
		stack2.push("J");
		stack2.push("C");
		System.out.println(stack2);
	}
}
