package collection.lesson9_1;


public class MyStringStackSingly {
	Node1 head;
	Node1 tail;
	
	public static void main(String[] args) {
		MyStringStackSingly stack = new MyStringStackSingly();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		stack.push("John");
		
		System.out.print(stack);
		System.out.println("Popping… " + stack.pop());
		System.out.println("Peeking… " + stack.peek());
		System.out.println("Popping… " + stack.pop());
			
	}
	
	public void push(String s) {
		Node1 node = new Node1(s);
		if (tail == null) {
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}
	
	public String pop() {
		if (tail == null) return "Empty";
		else {
			Node1 n = head;
			String s = tail.value;
			while (n != null) {
				if (n.next.next == null) {
					tail = n;
					n.next = null;
				}
				n = n.next;
			}
			return s;
		}
	}
	
	public String peek() {
		if (tail == null) return "Empty";
		else {
			return tail.value;
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
