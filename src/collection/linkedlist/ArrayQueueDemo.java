package collection.linkedlist;

public class ArrayQueueDemo {
	int[] a;
	int front;
	int rear;
	
	public ArrayQueueDemo(int n) {
		a = new int[n];
		front = -1;
		rear = 0;
	}
	
	public void enqueue(int num) {
		if (front == -1) {
			front++;
			a[rear] = num;
		} else {
			rear++;
			a[rear] = num;
		}
	}
	
	public int dequeue() {
		if (isEmpty()) return 0;
		int n = a[front];
		a[front] = 0;
		front++;
		return n;
	}
	
	public int peek() {
		if (isEmpty()) return 0;
		return a[front];
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("No elements");
		} else {
			for (int i = front; i <= rear; i++) {
				System.out.println(a[i]);
			}
		}
	}
	
	public boolean isEmpty() {
		if (rear > front) return false;
		return true;
	}
}
