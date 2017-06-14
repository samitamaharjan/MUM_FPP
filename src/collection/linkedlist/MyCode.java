package collection.linkedlist;

class MyCode {
    public static void main (String[] args) {
        MyLinkedList list = new MyLinkedList();
        
        list.add("12");
        list.add("5");
        list.add("9");
        list.add("11");
        list.add("18");
        
        list.insert("new", 3);
        // print(list);
        System.out.println(list);
        
        list.remove("9");
        System.out.println(list);
        
        list.remove("12");
        System.out.println(list);
        
        list.remove("18");
        System.out.println(list);
        
    }
    
    // print method retired
    public static void print(MyLinkedList list) {
        Node node = list.head;
        while (node != null) {
            System.out.printf("Value: %s, Previous: %s, Next: %s\n", 
                              getValue(node), 
                              getValue(node.previous),
                              getValue(node.next));
            node = node.next;
        }
    }
    
    public static String getValue(Node node) {
        return (node != null) ? node.value : "";
    }
}

class Node {
    Node previous;
    Node next;
    String value;
    
    public Node(String value) {
        this.value = value;
    }
}

class MyLinkedList {
    Node head;
    Node tail;
    int size;
    
    public void add(String value) {
        Node node = new Node(value);
        
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }
    
    public int size() {
        return size;
    }
    
    public void insert(String data, int pos) {
        Node n = new Node(data);
        
        // if there are no elements in linkedlist already
        if (head == null) {
            if (pos != 0) return;
            head = n;
            return;
        }
        
        // if we're inserting prior to the head
        if (pos == 0) {
            n.next = head;
            head.previous = n;
            head = n;
            return;
        }
        
        // iterating from head to pos - 1 position
        Node node = head;
        int i = 0;
        while (i < (pos - 1)) {
            if (node == null) {
                return;
            }
            
            node = node.next;
            i++;
        }
        Node n1 = node;
        Node n2 = node.next;
        
        // linking the new node to previous element
        n1.next = n;
        n.previous = n1;
        
        // link the new node to next element, if present.
        if (n2 != null) {
            n.next = n2;
            n2.previous = n;
        }
    }
    
    public boolean remove(String data) {
        Node n = head;
        if (head.value == data) {
            n.next.previous = null;
            head = n.next;
            n.next = null;
            return true;
        }
        
        while (n != null) {
            if (n == tail && tail.value == data) {
                n.previous.next = null;
                tail = n.previous;
                n.previous = null;
                return true;
            }
            
            if (n.value == data) {
                n.previous.next = n.next;
                n.next.previous = n.previous;
                n.previous = null;
                n.next = null;
                return true;
            }
            n = n.next;
        }
        return false;
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
}