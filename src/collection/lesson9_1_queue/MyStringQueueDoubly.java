package collection.lesson9_1_queue;


public class MyStringQueueDoubly {
	Node head;
	Node tail;
	
	public static void main(String[] args) {
		MyStringQueueDoubly queue = new MyStringQueueDoubly();
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		queue.enqueue("d");
		
		System.out.println(queue);
		System.out.println("Dequeue… " + queue.dequeue());
		System.out.println("Peek… " + queue.peek());
		System.out.println("Dequeue… " + queue.dequeue());
	}
	
	public void enqueue(String s) {
		Node node = new Node(s);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.previous = tail;
			tail = node;
		}
	}
	
	public String dequeue() {
		Node node = head;
		node.next.previous = null;
		head = node.next;
		node.next = null;
		return node.value;
	}
	
	public String peek() {
		return head.value;
	}
	
	@Override
    public String toString() {
        Node node = head;
        
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.value);
            if (node.next != null) {
                sb.append(" -> ");
            }
            node = node.next;
        }
        return sb.toString();
    }
	
	/* to print in reverse order
	@Override
	public String toString() {
		Node node = tail;
		StringBuilder sb = new StringBuilder();
		while (node != null) {
			sb.append(node.value);
			if (node.previous != null) {
				sb.append(" -> ");
			}
			node = node.previous;
		}
		return sb.toString();
	}*/
}

class Node {
	String value;
	Node next;
	Node previous;
	Node(String value){
		this.value = value;
	}
}
