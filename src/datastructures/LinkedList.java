package datastructures;

public class LinkedList {
	
	public Node head;
	
	
	//LinkedList contains a static node class
	static class Node {
		
		//Stored value, in this case integer.
		int value;
		
		//Next pointer, points to the next value in the linked list
		Node next;
		
		//Node constructor, is created with a value
		Node(int v) {
			value = v;
			next = null;
		}
	}
	
	
	//To push a value to the front, create a new Node, then set the next value of the created Node to the head. Then set the head of the LinkedList to the created node.
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
	
	public void deleteNode(int index) {

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
