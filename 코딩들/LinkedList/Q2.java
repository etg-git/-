package LinkedList;

public class Q2 {
	public static void main(String[] args) {
		Node head = null;
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		head = n1;
		n1.next = n2;
		n2.next = n3;
		for (Node p = head; p != null; p = p.next)

			System.out.print(p.data + "->");
	}
}
