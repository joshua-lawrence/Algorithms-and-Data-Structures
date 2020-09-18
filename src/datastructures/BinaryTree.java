package datastructures;

public class BinaryTree {
	
	public Node root;
	
	static class Node {
		int value;
		Node left;
		Node right;

		Node(int item) {
			value = item;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
			
		
	}
	
}
