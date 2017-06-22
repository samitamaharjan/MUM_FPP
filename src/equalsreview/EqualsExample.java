package equalsreview;

class EqualsExample {
    public static void main (String[] args) {
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Computer Science");
        Student s1 = new Student(101, "Samita", "s@gmail.com", dept1);
        Student s2 = new Student(101, "Samita", "s@gmail.com", dept2);
        
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}

class Student {
    int id;
    String name;
    String email;
    Department dept;
    
    public Student(int id, String name, String email, Department dept) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
    }
    
    @Override
    public boolean equals(Object ob) {
        if (ob == null || (ob.getClass() != this.getClass())) return false;
        Student sob = (Student) ob;
        return this.id == sob.id 
            && this.name.equals(sob.name) 
            && this.email.equals(sob.email)
            && this.dept.equals(sob.dept);
    }
}

class Department {
    String name;
    
    public Department(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object ob) {
        if (ob == null || (ob.getClass() != Department.class)) return false;
        Department sob = (Department) ob;
        return this.name.equals(sob.name);
    }
}