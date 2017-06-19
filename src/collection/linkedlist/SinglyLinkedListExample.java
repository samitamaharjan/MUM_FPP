package collection.linkedlist;

public class SinglyLinkedListExample {

	public static void main(String[] args) {
		MySingleLinkedList list = new MySingleLinkedList();
        
		list.display();
        list.add("12");
        list.add("5");
        list.add("9");
        list.add("11");
        list.add("18");
        
        list.display();
        list.insert("mid", 3);
        list.display();
        list.insert("head", 0);
        list.insert("tail", 7);
        list.display();
        list.remove("mid");
        System.out.println("");
        list.display();
        
        list.remove("head");
        list.display();
        list.remove("tail");
        list.display();
	}

}

class Node1 {
	Node1 next;
	Object value;
	
	public Node1(Object value) {
		this.value = value;
	}
}

class MySingleLinkedList {
	Node1 head;
	Node1 tail;
	int size;
	
	public void add(Object value) {
		Node1 node = new Node1(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}
	
	public void remove(Object item) {
		int pos = find(item);
		Node1 node = head;
		// if found at head
		if (pos == 0) {
			head = node.next;
			node = null;
			return;
		} 
		// if found in the middle
		int i = 0;
		while (i < pos - 1) {
			node = node.next;
			i++;
		}
		if (node.next.next != null) {
			node.next = node.next.next;
		} else  {
			node.next = null;
		}
	}
	
	public int find(Object item) {
		Node1 node = head;
		int index = 0;
		while (node != null) {
			if (node.value == item) return index;
			node = node.next;
			index++;
		}
		return index;
	}
	
	public void insert(Object item, int pos) {
		Node1 node = new Node1(item);
		if (pos == 0) {
			node.next = head;
			head = node;
			return;
		}
		
		Node1 n = head;
		int i = 0;
		while (i < pos - 1) {
			if (n == null) return;
			n = n.next;
			i++;
		}
		// check if n is the last node
		if (n.next != null) {
			node.next = n.next;
		}
		n.next = node;
	}
	
	public void display() {
		String str = "";
		if (head == null) {
			System.out.println("Nothing to display");
		} else {
			Node1 node = head;
			while (node != null) {
				str += node.value;
				if (node.next != null) {
					str += " -> ";
				}
				node = node.next;
			}
		}
		System.out.println(str);
	}
}
