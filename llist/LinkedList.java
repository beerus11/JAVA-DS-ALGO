package llist;

/**
 * 
 * @author Anurag
 * 
 */
public class LinkedList {
	Node head, tail;

	public LinkedList() {
		head = tail = null;
	}

	/**
	 * 
	 * @param data
	 *            @ Insert at End
	 */
	public void insert(int data) {
		Node temp = new Node(data);
		if (this.tail == null) {
			this.head = this.tail = temp;
		} else {
			this.tail.setNext(temp);
			this.tail = temp;
		}
	}

	/**
	 * 
	 * @param data
	 * @param pos
	 *            Insert At nth Position
	 */
	public void insert(int data, int pos) {
		Node temp = new Node(data);
		if (this.tail == null) {
			this.tail = temp;
			this.head = this.tail;
		} else {
			if (pos == 1) {
				temp.setNext(head);
				this.head = temp;
			} else if (pos > 1) {
				int iteration = 0;
				Node currentNode = this.head;
				while (iteration < (pos - 2)) {
					currentNode = currentNode.getNext();
					iteration++;
				}
				temp.setNext(currentNode.getNext());
				currentNode.setNext(temp);
			} else {
				System.out.println("Invalid Index");
			}
		}
	}

	/**
	 * 
	 * @param data
	 *            Insert At Beginning
	 */
	public void insertAtBegin(int data) {
		Node temp = new Node(data);
		if (this.head == null) {
			this.head = temp;
			this.tail = this.head;
		} else {
			temp.setNext(head);
			this.head = temp;
		}
	}

	/**
	 * Delete LastNode
	 */
	public void deleteLastNode() {
		this.tail = getnthNodeFromBegin(getLength() - 1);
		this.tail.setNext(null);
	}

	/**
	 * Delete FirstNode
	 */
	public void deleteFirstNode() {
		this.head = this.head.getNext();
	}

	/**
	 * Reverse LinkedList using Iterative Method
	 */
	public void reverse() {
		Node currentNode = this.head;
		while (currentNode != tail) {
			this.head = currentNode.getNext();
			currentNode.setNext(this.tail.getNext());
			this.tail.setNext(currentNode);
			currentNode = this.head;
		}
	}

	/**
	 * Reverse LinkedList using Recursive Method
	 */
	public void reverseUsingRecursion() {
		reverseUtil(this.head, null);
	}

	private Node reverseUtil(Node current, Node prev) {
		if (current.getNext() == null) {
			this.head = current;
			current.setNext(prev);
			return null;
		}

		Node next = current.getNext();
		current.setNext(prev);
		reverseUtil(next, current);
		return head;

	}

	/**
	 * print all elements of LinkedList
	 */
	public void print() {
		Node temp = this.head;
		if (temp == null) {
			System.out.println("LinkedList is Empty");
		} else {
			while (temp != null) {
				System.out.print(temp.getData() + ",");
				temp = temp.getNext();
			}
		}
	}

	/**
	 * 
	 * @return Get LinkedList Length
	 */
	public int getLength() {
		int length = 0;
		Node temp;
		temp = this.head;
		while (temp != null) {
			temp = temp.getNext();
			length++;
		}
		return length;
	}

	/**
	 * 
	 * @return First Node
	 */
	public Node getFirstNode() {
		return this.head;
	}

	/**
	 * 
	 * @return Get Last Node
	 */
	public Node getLastNode() {
		/**
		 * return this.tail
		 */
		Node currentNode = this.head;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	/**
	 * 
	 * @param pos
	 * @return nth node from beginning (1-length)
	 */
	public Node getnthNodeFromBegin(int pos) {
		int iteration = pos - 1;
		Node currentNode = this.head;
		while (iteration > 0) {
			currentNode = currentNode.getNext();
			iteration--;
		}
		return currentNode;
	}

	/**
	 * 
	 * @param pos
	 * @return nth node from Last
	 */
	public Node getnthNodeFromEnd(int pos) {
		int iteration = getLength() - pos;
		Node currentNode = this.head;
		while (iteration > 0) {
			currentNode = currentNode.getNext();
			iteration--;
		}
		return currentNode;
	}

	public class Node {
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

		public void setNext(Node node) {
			this.next = node;
		}

		public Node getNext() {
			return this.next;
		}
	}
}
