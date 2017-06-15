package ExamEqual;

public class Main {

	public static void main(String[] args) {
        Student james = new Student("123", "james");
        
        Professor sarita = new Professor("Sarita");
        Professor sudha = new Professor("Sudha");
        Professor samita = new Professor("Samita");
        Professor shreeja = new Professor("Shreeja");
        
        Course course = new Course();
        course.addProfessor(shreeja);
        course.addProfessor(sudha);
        course.addProfessor(samita);
        course.addProfessor(sarita);

        Marks marks = new Marks(james, sarita, course, 78);
        
        for (Professor prof : course.professors) {
            if (sarita.equals(prof)) {
                System.out.println("She teaches this course");
                return;
            }
        }
        System.out.println("She doesn't teach this course");
    }

}
