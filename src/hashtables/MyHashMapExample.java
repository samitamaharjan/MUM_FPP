package hashtables;

import java.util.Arrays;

class MyHashMapExample {
    public static void main (String[] args) {
        Contractor s1 = new Contractor("123", "James");
        Contractor s2 = new Contractor("101", "Samita");
        
        MyMap<String, Contractor> map = new MyMap<>();
        map.put(s1.id, s1);
        map.put(s2.id, s2);
        
        System.out.println(map.get(s1.id));
        System.out.println(map.get(s2.id));
        
        System.out.println(Arrays.toString(map.arr));
    }
}

class Contractor {
    String id;
    String name;
    
    public Contractor(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return String.format("Contractor ID: %s, Name: %s", id, name);
    }
}

class MyMap<K, V> {
    
    int size = 100;
    Object[] arr = new Object[size];
    
    K k;
    V v;
    
    public void put(K k, V v) {
        int pos = k.hashCode() % size;
        arr[pos] = v;
    }
    
    public Object get(K k) {
        int pos = k.hashCode() % size;
        return arr[pos];
    }
}
