package collection.lesson9_1_queue;


public class MyStringQueueSingly {
	Node1 head;
	Node1 tail;
	
	public static void main(String[] args) {
		MyStringQueueSingly queue = new MyStringQueueSingly();
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		queue.enqueue("d");
		
		System.out.println(queue);
		System.out.println("Dequeue " + queue.dequeue());
		System.out.println("Peek " + queue.peek());
		System.out.println("Dequeue " + queue.dequeue());
	}
	
	public void enqueue(String s) {
		Node1 node = new Node1(s);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}
	
	public String dequeue() {
		Node1 node = head;
		String s = node.value;
		head = node.next;
		node.next = null;
		return s;
	}
	
	public String peek() {
		return head.value;
	}
	
	@Override
    public String toString() {
        Node1 node = head;
        
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
}

class Node1 {
	String value;
	Node1 next;
	Node1(String value){
		this.value = value;
	}
}
