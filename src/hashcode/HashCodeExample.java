package hashcode;

class HashCodeExample {
    public static void main (String[] args) {
        
        Student student1 = new Student("12345", "james");
        Student student2 = new Student("james", "12345");
        
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}

class Student {
    String id;
    String name;
    
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    /* // Returns same hashcode when id and name are switched because
    // the sum of hashcodes for id and name are same
    @Override
    public int hashCode() {
        return id.hashCode() + name.hashCode();
    }*/
    
    @Override
    public int hashCode() {
    	int result = 17;
    	result += 31 * id.hashCode();
    	result += 13 * name.hashCode();
        return result;
    }
}
