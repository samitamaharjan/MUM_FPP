package collection.linkedlist;

public class MainArrayQueueDemo {

	public static void main(String[] args) {
		ArrayQueueDemo queue = new ArrayQueueDemo(12);
		queue.enqueue(15);
		queue.enqueue(20);
		queue.enqueue(69);
		
		System.out.println(queue.peek());
		//System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		System.out.println();
		queue.display();
	}

}
