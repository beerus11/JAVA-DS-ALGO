import queues.ArrayQueue;

public class ArrayQueueTest {

	public static void main(String args[]) {
		ArrayQueue queue = new ArrayQueue(10);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		while (!queue.isEmpty()) {
			System.out.println("" + queue.deQueue());
		}
	}
}
