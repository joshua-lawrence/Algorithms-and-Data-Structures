package datastructures;

public class LinkedList {

    private Node head;

    LinkedList(Node head) {
        this.head = head;
    }

    private static class Node<T> {
        private T data;
        private Node next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void push(Node node) {
        Node current = this.head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(node);
    }

    public void printList() {
        Node current = this.head;
        while(current.getNext() != null) {
            System.out.println(current.data);
            current = current.getNext();
        }
        System.out.println(current.data);
    }

    public static void main(String[] args) {
        Node newNode = new Node<Integer>(12);
        LinkedList linkedList = new LinkedList(newNode);
        newNode.setNext(new Node<Integer>(14));

        linkedList.push(new Node<Double>(42.5));

        linkedList.printList();

    }



}
