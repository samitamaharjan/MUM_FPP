package collection.linkedlist3;

class LinkedListMinSort2 {
    public static void main (String[] args) {
        MyLinkedList list = new MyLinkedList();
        
        list.add("sa");
        list.add("re");
        list.add("ga");
        list.add("ma");
        list.add("pa");
        System.out.println(list);
        
        list.sort();
        System.out.println(list);
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
    
    public Node get(int index) {
        Node node = head;
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
            process(i,len-1);
        }
    }
    
    private void process(int startIndex, int endIndex){  
        Node node1 = this.get(startIndex);
        for(int i = startIndex + 1; i <= endIndex; ++i){
            Node node2 = this.get(i);
            if(node2.value.compareTo(node1.value) < 1) { 
                String temp = node1.value;
                node1.value = node2.value;
                node2.value = temp;
            }
        }
    }
}