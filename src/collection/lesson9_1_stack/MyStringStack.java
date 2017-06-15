package collection.lesson9_1_stack;

public class MyStringStack {
	Node head;
	Node tail;
	
	public static void main(String[] args) {
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		
		System.out.println("Popping… " + stack.pop());
		System.out.println("Peeking… " + stack.peek());
		System.out.println("Popping… " + stack.pop());
		
		stack.push("John");
		System.out.println("Popping… " + stack.pop());
	}
	
	public void push(String s) {
		Node node = new Node(null, null, s);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head.previous = node;
			head = node;
		}
	}
	
	public String pop() {
		if (head == null) return "Empty";
		
		Node node = head;
		node.next.previous = null;
		head = node.next;
		node.next = null;
		return node.value;
	}
	
	public String peek() {
		if (head == null) return "Empty";
		return head.value;
	}
}

class Node {
	String value;
	Node next;
	Node previous;
	Node(Node next, Node previous, String value){
		this.next = next;
		this.previous = previous;
		this.value = value;
	}
}
