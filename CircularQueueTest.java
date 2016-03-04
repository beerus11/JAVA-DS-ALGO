import queues.CircularQueue;

public class CircularQueueTest {
	public static void main(String args[]) {
		CircularQueue queue = new CircularQueue(5);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.deQueue();
		queue.enQueue(6);
		while (!queue.isEmpty()) {
			System.out.println("" + queue.deQueue());
		}

	}

}