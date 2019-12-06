package LinkedList;

public class DoubleLinkedList {
	Node head =null;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		newNode.next = head;		
		head = newNode;
		newNode.prev = null;
		
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head!=null) {
			Node p = head;
			
			while(p.next!=null) p = p.next;
			
			p.next = newNode;
			newNode.prev = p;
			
		}
		else head = newNode;
	}
	
	public void removeFirst() {
		Node p = head;
		
		head = head.next;
		p.next = null;
		
		head.prev = null;
		
	}
	
	public void removeLast() {
		Node p = head, prev = null;
		
		if(head!=null) {
			
			while(p.next!=null) {
				p.prev = prev;
				prev = p;
				p = p.next;
			}
			
			if(prev!=null) 
				prev.next = null;			
			
			else head = null;
		}
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
