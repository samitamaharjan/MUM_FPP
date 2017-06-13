package ListStudent;

import java.util.ArrayList;

public class MainStudent {

	public static void main(String[] args) {
		double totalSalary = 0;
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Undergrad("Samita", "Maharjan", 25, 12));
		students.add(new Undergrad("Samita", "Maharjan", 25, 12));
		students.add(new Undergrad("Samita", "Maharjan", 25, 12));
		students.add(new Grad("Shreeja", "Shrestha", 200));
		students.add(new Grad("Shreeja", "Shrestha", 200));
		
		for (Student stu : students) {
			if (stu instanceof Undergrad) {
				totalSalary += ((Undergrad) stu).getPay();
				
			} else {
				totalSalary += ((Grad) stu).getPay();
			}
		}
		System.out.println("The total salary is "+ totalSalary);
	}

}
