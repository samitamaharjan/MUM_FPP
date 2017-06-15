package collection.lesson8_2;

public class MyStringLinkedList {
	Node header;
	Node tail;
	int size;
	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.add("s");
		list.add("b");
		list.add("r");
		list.add("t");
	
		System.out.println(list);
		list.insert("p", 2);
		System.out.println("adding at 4");
		System.out.println(list);
		
		list.remove("4");
		System.out.println("removing tail");
		System.out.println(list);
		
		list.sort();
		System.out.println("after sorting");
		System.out.println(list);
		System.out.println(list.search("a"));
		
	}

	public void add(String item){
		Node n = new Node(null, null, item);
		if (header == null) {
			header = n;
			tail = n;
		} else {
			tail.next = n;
			n.previous = tail;
			tail = n;
		}
		size++;
	}

	public void insert(String data, int pos) {
		// New node with value data is assigned
		Node n = new Node(null, null, data);
		// if head is null
		if (header == null) {
			header = n;
			return;
		}
		// if the index pos is 0 or to insert at the beginning of the linkedlist
		if (pos == 0) {
			n.next = header;
			header.previous = n;
			header = n;
			return;
		}
		// to insert the node at the middle
		Node node = header;
		int i = 0;
		while(i < (pos - 1)) {
			if (node == null) return;
			node = node.next;
			i++;
		}
		Node n1 = node;
		Node n2 = node.next;
		
		n1.next = n;
		n.previous = n1;
		// if the position is at the end/tail
		if (n2 != null) { 
			n2.previous = n;
			n.next = n2;
		}
	}
	
	public boolean remove(String data) {
		Node node = header;
		// to remove first header value
		if (node.value == data) {
			node.next.previous = null;
			header = node.next;
			node.previous = null;
			size--;
			return true;
		}
		
		// to remove any middle value
		while (node != null) {
			if (node.value == data) {
				node.previous.next = node.next;
				// check if the node is last node
				if (node.next != null) {
					node.next.previous = node.previous;
				}
				node.next = null;
				node.previous = null;
				size--;
				return true;
			}
			node = node.next;
		}
		return false;
	}
	public Node get(int index) {
		Node node = header;
		int i = 0;
		while (i < index) {
			node = node.next;
			i++;
		}
		return node;
	}
	
	public void sort(){
		if(this == null || this.size() <=1) return;
		int len = this.size();
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i,len-1);
			swap(i,nextMinPos); 
		}
	}
	
	void swap(int i, int j){
		String temp = this.get(i).value;
		this.get(i).value = this.get(j).value;
		this.get(j).value = temp;
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){		
		String m = this.get(bottom).value;
		int index = bottom;
		for(int i = bottom + 1; i <= top; ++i){
			if(this.get(i).value.compareTo(m) < 1) { 
				m = this.get(i).value;
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}
	
	public boolean search(String s) {
		Node n = header;
		while (n != null) {
			if (n.value == s) return true;
			n = n.next;
		}
		return false;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		Node n = header;
		StringBuilder sb = new StringBuilder();
		while (n != null) {
			sb.append(n.value);
			if (n.next != null) {
				sb.append(" -> ");
			}
			n = n.next;
		}
		return sb.toString();
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


