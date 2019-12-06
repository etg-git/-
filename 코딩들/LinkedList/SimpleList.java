package LinkedList;

public class SimpleList {
	Node head = null;
	Node tail = null;
	int size = 0;

	/*public void addLast(int data) {
		if(tail == null) head = tauk = new Node(data);
		else {
		tail.next = new Node(data);
		tail = tail.next;
		}

		public int size() {
		return size;
		}
		*/
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

		size++;

		if (head.next == null)
			tail = head;
	}

	public void addLast(int i) {
		Node newNode = new Node(i);

//		if (head != null) {
//			Node p = head;
//			while (p.next != null)
//				p = p.next;
//			p.next = newNode;
//		} else
//		cl	head = newNode;

		if (size == 0) {
			addFirst(i);
		} else {
			tail.next = newNode;
			tail = newNode;

			size++;
		}

	}

	public void removeFirst() {
		if (head != null) {
			Node p = head;
			head = head.next;
			p.next = null;
		}
	}

	public void removeLast() {
		if (head != null) {
			Node p = head, prev = null;
			while (p.next != null) {
				prev = p;
				p = p.next;
			}
			if (prev != null)
				prev.next = null;
			else
				head = null;
		}
	}

	public int size() {
		int size = 0;
		for (Node p = head; p != null; p = p.next)
			size++;

		return size;
	}

	public int get(int i) {
		Node p = head;

		for (int a = 0; a < i; a++)
			p = p.next;

		return p.data;

	}

	@Override
	public String toString() {
		String v = "";
		for (Node p = head; p != null; p = p.next) {
			if (v.length() > 0)
				v += "->";
			v += p.data;
		}
		return v;
	}
}