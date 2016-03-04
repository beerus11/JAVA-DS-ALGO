package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	public void setRoot(int data) {
		this.root = new Node(data);
	}

	public Node getRoot() {
		return this.root;
	}

	public void printPreOrder(Node root) {
		if (root != null) {
			System.out.print(root.getData());
			printPreOrder(root.getLeft());
			printPreOrder(root.getRight());
		}
	}

	public void printPostOrder(Node root) {
		if (root != null) {
			printPostOrder(root.getLeft());
			printPostOrder(root.getRight());
			System.out.print(root.getData());
		}
	}

	public void printInOrder(Node root) {
		if (root != null) {
			printInOrder(root.getLeft());
			System.out.print(root.getData());
			printInOrder(root.getRight());
		}
	}

	public Node insertLeft(Node node, int data) {
		node.setLeft(new Node(data));
		return node;
	}

	public Node insertRight(Node node, int data) {
		node.setRight(new Node(data));
		return node;
	}

	public class Node {
		public int data;
		public Node left;
		public Node right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}

		public void setData(int data) {
			this.data = data;
		}

		public int getData() {
			return this.data;
		}

		public void setLeft(Node node) {
			this.left = node;
		}

		public Node getLeft() {
			return this.left;
		}

		public void setRight(Node node) {
			this.right = node;
		}

		public Node getRight() {
			return this.right;
		}
	}

	public static int maxElement(Node root) {
		if (root == null)
			return 0;
		int max = root.getData();
		max = Math.max(maxElement(root.getLeft()), max);
		max = Math.max(maxElement(root.getRight()), max);
		return max;

	}

	public static int minElement(Node root) {
		if (root == null)
			return 0;
		int min = root.getData();
		if (root.getLeft() != null)
			min = Math.min(minElement(root.getLeft()), min);
		if (root.getRight() != null)
			min = Math.min(minElement(root.getLeft()), min);
		return min;

	}

	public static Boolean searchElement(Node root, int e) {
		if (root == null)
			return false;
		int value = root.getData();
		if (value == e)
			return true;
		if (searchElement(root.left, e))
			return true;
		return searchElement(root.right, e);

	}

	public static int findSize(Node root) {
		if (root == null)
			return 0;
		else
			return findSize(root.getLeft()) + findSize(root.getRight()) + 1;
	}

	public static void printLevelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.println(tempNode.getData());
			if (tempNode.getLeft() != null)
				queue.add(tempNode.getLeft());
			if (tempNode.getRight() != null)
				queue.add(tempNode.getRight());

		}
	}

	public static void printLevelOrderReverse(Node root) {
		Stack<Node> stack = new Stack<Node>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			stack.add(tempNode);
			if (tempNode.getLeft() != null)
				queue.add(tempNode.getLeft());
			if (tempNode.getRight() != null)
				queue.add(tempNode.getRight());

		}
		while (!stack.isEmpty()) {
			System.out.println("" + stack.pop().getData());
		}
	}

	public static int getHeight(Node root) {
		if (root == null) {
			return -1;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;

	}

	public static Node getDeepestNode(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		Node temp = null;
		while (!queue.isEmpty()) {
			temp = queue.poll();
			if (temp.getLeft() != null)
				queue.add(temp.getLeft());
			if (temp.getRight() != null)
				queue.add(temp.getRight());
		}
		return temp;
	}

	public static void DeleteTree(Node root) {
		if (root == null) {
			return;
		}
		DeleteTree(root.getLeft());
		DeleteTree(root.getRight());
		root = null;
	}

	
}
