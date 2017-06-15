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
		System.out.println("Pushing… " + stack.pop());
	}
	
	public void push(String s) {
		Node node = new Node(null, null, s);
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.previous = tail;
			tail = node;
		}
	}
	
	public String pop() {
		if (tail == null) return "Empty";
		else {
			String s = tail.value;
			tail = tail.previous;
			tail.next = null;
			return s;
		}
	}
	
	public String peek() {
		if (tail == null) return "Empty";
		else {
			return tail.value;
		}
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
