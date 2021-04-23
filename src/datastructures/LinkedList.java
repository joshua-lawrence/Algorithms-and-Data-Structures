package datastructures;

public class LinkedList<T> {

    private Node<T> head;

    LinkedList(Node<T> head) {
        this.head = head;
    }

    LinkedList(T head) {
        this.head = new Node<>(head);
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
        public void setNext(T next) {
            this.next = new Node<>(next);
        }

        public void deleteNext() {
            this.next = null;
        }

    }

    public void push(T value) {
        Node<T> current = this.head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Node<T>(value));
    }

    public T pop() {
        Node<T> current = this.head;
        Node<T> previous = null;
        while(current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        previous.deleteNext();
        return current.getData();
    }

    public void printList() {
        Node<T> current = this.head;
        while(current.getNext() != null) {
            System.out.println(current.data);
            current = current.getNext();
        }
        System.out.println(current.data);
    }

    public static void main(String[] args) {
        Node<Integer> newNode = new Node<>(12);
        LinkedList<Integer> linkedList = new LinkedList<>(newNode);
        newNode.setNext(14);

        linkedList.push(42);

        linkedList.printList();

    }



}
