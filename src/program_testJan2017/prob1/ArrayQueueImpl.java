package program_testJan2017.prob1;


public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	private int size = 0;

	public int peek() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("Queue is Empty");
		}
		return arr[front];
	}

	public void enqueue(int obj) {
		if (front == -1) {
			front++;
		} else if (rear == arr.length) {
			int[] temp = new int[arr.length * 2];
			System.arraycopy(arr, 0, temp, 0, arr.length);
			arr = temp;
		}
		arr[rear] = obj;
		rear++;
		size++;
	}

	public int dequeue() throws QueueException {
		if (isEmpty()) {
			throw new QueueException("Queue is Empty");
		} 
		int val = arr[front];
		front++;
		size--;
		return val;
	}

	public boolean isEmpty() {
		if (front == -1 || front > rear) {
			return true;
		}
		return false;
	}

	public int size() {
		// implement
		return size;
	}

}
