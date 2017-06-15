package ExamEqual;

import java.util.ArrayList;
import java.util.List;

class Course {
    
    List<Professor> professors = new ArrayList<>();

    public void addProfessor(Professor prof) {
        professors.add(prof);
    }
}
