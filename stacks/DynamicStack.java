package stacks;

public class DynamicStack {

	class Node {
		private int data;
		private Node next;

		public void setData(int data) {
			this.data = data;
		}

		public int getData() {
			return this.data;
		}

		public void setNext(Node node) {
			this.next = node;
		}

		public Node getNext() {
			return this.next;
		}

	}
}
