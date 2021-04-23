package datastructures;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    private Integer count;
    private Node head;

    public BinaryTree(Node head) {
        this.head = head;
    }

    public static class Node<T> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        Node(T data, Node<T> left, Node<T> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    public Integer getCount() {
        return count;
    }

    private void setCount(Integer count) {
        this.count = count;
    }

    public void printTreeInorder() {
        System.out.println("========== Printing out tree in order, in a BST this will give nodes in a non-decreasing order =========");
        printInorder(head);
    }

    public void printTreePreorder() {
        System.out.println("========== Printing out tree pre order, can be used to copy the tree =========");
        printPreorder(head);
    }

    public void printTreePostorder() {
        System.out.println("========== Printing out tree post order, can be used to delete the tree =========");
        printPostorder(head);
    }


    private void printInorder(Node node) {
         if(node == null) {
             return;
         }
         printInorder(node.getLeft());

        System.out.println(node);

        printInorder(node.getRight());
    }

    private void printPreorder(Node node) {
        if(node == null) {
            return;
        }
        System.out.println(node);

        printPreorder(node.getLeft());
        printPreorder(node.getRight());
    }

    private void printPostorder(Node node) {
        if(node == null) {
            return;
        }
        printPostorder(node.getLeft());
        printPostorder(node.getRight());

        System.out.println(node);
    }

    public static void main(String[] args) {

        var n1 = new Node<>(1);
        var n2 = new Node<>(2);
        var n3 = new Node<>(3);
        var n4 = new Node<>(4);
        var n5 = new Node<>(5);
        var n6 = new Node<>(6);

        BinaryTree bt = new BinaryTree(n1);

        /**
         *       1
         *    2    3
         *  4   5    6
         */

        n1.setLeft(n2);
        n1.setRight(n3);

        n2.setLeft(n4);
        n2.setRight(n5);

        n3.setRight(n6);

        bt.printTreeInorder();
        bt.printTreePreorder();
        bt.printTreePostorder();
    }
	
}
