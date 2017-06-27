package program_testJan2017.prob1;

public class Main {

	public static void main(String[] args) throws QueueException {
		ArrayQueueImpl q = new ArrayQueueImpl();
		// q.peek();
		for (int i = 0; i < 15; i++) {
			q.enqueue(i);
		}

		System.out.println("The top element: " + q.peek());

		for (int i = 0; i < 16; i++) {
			System.out.println("Dequeing the elements " + q.dequeue());
		}

		System.out.println("THe size of queue is: " + q.size());
	}
}
