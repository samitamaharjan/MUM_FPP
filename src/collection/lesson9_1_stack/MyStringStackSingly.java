package collection.lesson9_1_stack;


public class MyStringStackSingly {
	Node1 head;
	Node1 tail;
	
	public static void main(String[] args) {
		MyStringStackSingly stack = new MyStringStackSingly();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		
		System.out.println(stack);
		System.out.println("Popping… " + stack.pop());
		System.out.println("Peeking… " + stack.peek());
		System.out.println("Popping… " + stack.pop());
			
	}
	
	public void push(String s) {
		Node1 node = new Node1(s);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	public String pop() {
		Node1 node = head;
		String s = node.value;
		head = node.next;
		node.next = null;
		return s;
	}
	
	public String peek() {
		if (head == null) return "Empty";
		else {
			return head.value;
		}
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
