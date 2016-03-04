package llist;

public class ReverseLinkedList {
	public static void main(String args[]) {
		Node head = new Node(1);
		head.setNext(2);
		head.getNext().setNext(3);
		head.getNext().getNext().setNext(4);
		head.getNext().getNext().getNext().setNext(4);
		head.getNext().getNext().getNext().getNext().setNext(5);
		Node currentNode = head;
		Node prevNode, nextNode;
		currentNode = Reverse(null, head);
		while (currentNode != null) {
			System.out.println("" + currentNode.getData());
			currentNode = currentNode.getNext();
		}

	}

	public static Node Reverse(Node prev, Node currentNode) {
		if (currentNode.getNext() == null) {
			currentNode.setNext(prev);
			return currentNode;
		}
		Node nextNode = currentNode.getNext();
		currentNode.setNext(prev);
		return Reverse(currentNode, nextNode);
	}

	public static class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

		public int getData() {
			return this.data;
		}

		public int setData(int data) {
			return this.data = data;
		}

		public void setNext(int data) {

			this.next = new Node(data);
		}

		public void setNext(Node node) {

			this.next = node;
		}

		public Node getNext() {
			return this.next;
		}

	}
}
