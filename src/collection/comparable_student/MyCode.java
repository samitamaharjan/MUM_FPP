package collection.comparable_student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyCode {
    
    public static void main (String[] args) {
        Employee e1 = new Employee("Samita", 3);
        Employee e2 = new Employee("Shreeja", 2);
        Employee e3 = new Employee("Sareeta", 1);
        Employee e4 = new Employee("Sudha", 2);
        Employee e5 = new Employee("James", 3);
        
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        
        Collections.sort(list);
        
        for (Employee emp : list) {
            System.out.printf("Name: %-20sFloor: %d\n", emp.name, emp.floor);
        }
    }
}

class Employee implements Comparable<Employee> {
    
    String name;
    int floor;
    
    public Employee(String name, int floor) {
        this.name = name;
        this.floor = floor;
    }
    
    @Override
    public int compareTo(Employee otherEmployee) {
        Employee thisEmployee = this;
       return thisEmployee.name.compareTo(otherEmployee.name);
    }
}