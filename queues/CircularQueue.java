package queues;

public class CircularQueue {
	private int front;
	private int rear;
	private int capacity;
	private int[] array;

	public CircularQueue(int size) {
		// TODO Auto-generated constructor stub
		this.capacity = size;
		this.front = -1;
		this.rear = -1;
		array = new int[size];

	}

	public boolean isFull() {
		return ((rear + 1) % capacity == front);
	}

	public boolean isEmpty() {
		return ((front == -1) && (rear == -1));
	}

	public int getQueueSize() {
		return (capacity - front + rear + 1) % capacity;
	}

	public int front() {
		return array[front];
	}

	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			rear = (rear + 1) % capacity;
			array[rear] = data;
			if (front == -1) {
				front = rear;
			}

		}

	}

	public int deQueue() {
		int data = 0;
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			data = array[front];
			if (front == rear) {
				front = rear = -1;
			} else {
				front = (front + 1) % capacity;
			}
		}
		return data;

	}
}
