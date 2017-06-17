package program_testJan2017.prob1;


public class ArrayQueueImpl {

	private int[] arr = new int[20];
	private int front = -1;
	private int rear = 0;
	private int size = 0;
	
	public int peek() {
		return arr[rear];
	}
	
	public void enqueue(int obj){
		if (front == -1) {
			front++;
			arr[rear] = obj;
		}
		if (rear > arr.length - 1) {
			resize();
		}
		else {
			rear++;
			arr[rear] = obj;
		}
		size++;
	}
	
	public int dequeue() {
		if (front == -1) return 0;
		else {
			int n = arr[front];
			arr[front] = 0;
			front++;
			size--;
			return n;
		}
	}
	
	public boolean isEmpty(){	
		if (front > rear) return true;
		return false;
	}
	
	public void resize() {
		int len = arr.length;
		int[] a = new int[len * 2];
		System.arraycopy(arr, 0, a, 0, rear + 1);
		arr = a;
	}
	
	public int size(){	
		return size;
	}
}
