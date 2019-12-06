package LinkedList;

//public class Node {
//	int data;
//	Node next;
//
//	public Node(int data) {
//		this.data = data;
//	}
//}
//
//public class SimpleList {
//	Node head;
//
//	public void addFirst(int data) {
//		Node newNode = new Node(data);
//		newNode.next = head;
//		head = newNode;
//	}
//
//	@Override
//	public String toString() {
//		String v = "";
//		for (Node p = head; p != null; p = p.next) {
//			if (v.length() > 0)
//				v += "->";
//			v += p.data;
//		}
//		return v;
//	}
//}

public class Q9 {
	public static void main(String[] args) {
		SimpleList list = new SimpleList();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		System.out.println(list);
	}
}