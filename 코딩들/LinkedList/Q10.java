package LinkedList;

//public class Node<T> {
//	T data;
//	Node<T> next;
//
//	public Node(T data) {
//		this.data = data;
//	}
//}
//
//public class SimpleList<T> {
//	Node<T> head;
//
//	public void addFirst(T data) {
//		Node<T> newNode = new Node<>(data);
//		newNode.next = head;
//		head = newNode;
//	}
//
//	@Override
//	public String toString() {
//		String v = "";
//		for (Node<T> p = head; p != null; p = p.next) {
//			if (v.length() > 0)
//				v += "->";
//			v += p.data;
//		}
//		return v;
//	}
//}

//public class Q10 {
//
//	public static void main(String[] args) {
//		SimpleList<Integer> listA = new SimpleList<>();
//		listA.addFirst(1);
//		listA.addFirst(2);
//		listA.addFirst(3);
//		System.out.println(listA);
//		SimpleList<String> listB = new SimpleList<>();
//		listB.addFirst("Korea");
//		listB.addFirst("Japan");
//		listB.addFirst("China");
//		System.out.println(listB);
//		SimpleList<Boolean> listC = new SimpleList<>();
//		listC.addFirst(true);
//		listC.addFirst(true);
//		listC.addFirst(false);
//		System.out.println(listC);
//	}
//}