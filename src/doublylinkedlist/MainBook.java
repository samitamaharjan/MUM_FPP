package doublylinkedlist;

public class MainBook {

	public static void main(String[] args) {
		Book b1 = new Book("100", "FPP");
		Book b2 = new Book("115", "MPP");
		
		MyLinkedList list = new MyLinkedList();
		list.add(b1);
		list.add(b2);
		
		list.display();
		System.out.println("=====");
		list.insert(b1);
		list.display();
	}

}
