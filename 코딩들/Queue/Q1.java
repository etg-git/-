package Queue;

import java.util.LinkedList;

public class Q1 {
	public static void main(String[] args) {
		 LinkedList<String> queue=new LinkedList<>();
		 queue.addLast("�ѱ�"); // ť rear�� �ڷ� ����, queue.add("�ѱ�");
		 queue.addLast("�̱�"); // ť rear�� �ڷ� ����
		 queue.addLast("����"); // ť rear�� �ڷ� ����
		 System.out.println("ť ��ü ����: "+queue);
		 System.out.println("ť ũ��="+queue.size());
		 System.out.println("ť�� ��� �ִ°�? "+queue.isEmpty());
		 String v=null;
		 v=queue.getFirst();
		 System.out.println("ť front �ڷ� Ȯ��="+v);
		 v=queue.removeFirst(); // String v=queue.remove();
		 System.out.println("ť front ���� ��="+v);
		 System.out.println("ť ��ü ����: "+queue);
		 System.out.println("ť front ���� ��="+queue.removeFirst());
		 System.out.println("ť ��ü ����: "+queue);
		 System.out.println("ť front ���� ��="+queue.removeFirst());
		 System.out.println("ť ��ü ����: "+queue);
		 System.out.println("ť�� ��� �ִ°�? "+queue.isEmpty());
		 } 
}
