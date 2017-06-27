package doublylinkedlist;

class MyLinkedList {
	Node head;
	Node tail;
	
	public int find(Book b) {
		Node node = head;
		int index = 0;
		while (node != null) {
			if (node.value.bookName == (b.bookName)) {
				return index;
			}
			node = node.next;
			index++;
		}
		return 0;
	}
	
	public void add(Book b) {
		Node n = new Node(b);
		if (head == null) {
			head = n;
			tail = n;
		} else {
			tail.next = n;
			n.previous = tail;
			tail = n;
		}
	}
	
	public void insert(Book b) {
		Node node = head;
		int pos = find(b);
		int i = 0;
		while(i < pos) {
			node = node.next;
			i++;
		}
		Node n = new Node(new Book("newId", "newBook"));
		Node n1 = node;
		Node n2 = node.next;
		n1.next = n;
		n.previous = n1;
		if(n2 != null) {
			n.next = n2;
			n2.previous = n;
		}
	}
	
	public void display() {
		Node node = head;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
}

class Book {
	String bookId;
	String bookName;
	
	public Book(String bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
	public String toString() {
		return bookId + " " + bookName;				
	}
}

class Node {
	Node previous;
	Node next;
	Book value;
	
	public Node(Book value) {
		this.value = value;
	}
}
