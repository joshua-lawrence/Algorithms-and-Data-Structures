package datastructures;

public class LinkedList {
	
	public Node head;
	
	static class Node {
		int value;
		Node next;
		
		Node(int v) {
			value = v;
			next = null;
		}
	}
	
	public void pushNode(int value) {
		Node front = new Node(value);
		front.next = head;
		head = front;
	}
	
	public void appendNode(int value) {
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = new Node(value);
	}
	
	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.value);
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList example = new LinkedList();
		
		example.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		example.head.next = second;
		second.next = third;
		
		example.appendNode(4);
		
		example.pushNode(0);
		
		example.printList();
	}

}
