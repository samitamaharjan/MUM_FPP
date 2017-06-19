package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MultiComparator {
    
    public static void main (String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 45000));
        list.add(new Employee("John", 22000));
        list.add(new Employee("Donald", 30000));
        list.add(new Employee("Susan", 30000));
        list.add(new Employee("Danny", 30000));
        
        System.out.println("Before sorting");
        for (Employee emp : list) {
            System.out.println(emp);
        }
        
        Collections.sort(list, new Comparator<Employee>() {
            
            @Override
            public int compare(Employee e1, Employee e2) {
                int diff = (int) (e1.getSalary() - e2.getSalary());
                if (diff == 0) {
                    return e1.getName().compareTo(e2.getName());
                }
                return diff;
            }
        });
        
        System.out.println("After sorting");        
        for (Employee emp : list) {
            System.out.println(emp);
        }
        
    }
}

class Employee {
    private String name;
    private double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String toString() {
        return String.format("%-10s %.2f", getName(), getSalary());
    }
}