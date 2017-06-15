package ExamEqual;

public class Professor {
	String name;

    public Professor(String name) {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object ob) {
        if (ob == null || !(ob instanceof Professor)) {
            return false;
        }
        
        Professor thisProfessor = this;
        Professor otherProfessor = (Professor) ob;
        
        if (thisProfessor.name.equals(otherProfessor.name)) {
            return true;
        }
        return false;
    }
}
