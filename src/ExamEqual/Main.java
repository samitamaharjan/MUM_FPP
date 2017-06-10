package ExamEqual;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor p = new Professor("Promila", "FPP");
		Student s = new Student("Samita", "Promila", "FPP");
		
		System.out.println(p.equals(s));
	}

}
