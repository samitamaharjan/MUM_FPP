package hashtables;

import java.util.HashMap;
import java.util.Map;

class HashMapExample {
    public static void main (String[] args) {
        Student s1 = new Student(101, "Samita", "s@gmail.com");
        Student s2 = new Student(102, "James", "j@gmail.com");
        Student s3 = new Student(103, "Shreeja", "sh@gmail.com");
        
        Map<Integer, Student> map = new HashMap<>();
        map.put(s1.id, s1);
        map.put(s2.id, s2);
        map.put(s3.id, s3);
                
        for(Map.Entry<Integer, Student> entry : map.entrySet()) {
            Student student = entry.getValue();
            int id = student.id;
            String name = student.name;
            String email = student.email;
            System.out.println(String.format("%-5d %-15s %-25s", id, name, email));
        }
        
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        
        for (Student student : map.values()) {
            System.out.println(String.format("%-5d %-15s %-25s", 
                                             student.id, student.name, student.email));
        }
    }
}

class Student {
    int id;
    String name;
    String email;
    
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }   
}