package collection.iterator_student;

import java.util.ArrayList;
import java.util.Iterator;

public class MainStudent {

	public static void main(String[] args) {
		double totalSalary = 0;
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Undergrad("Samita", "Maharjan", 25, 12));
		students.add(new Undergrad("Samita", "Maharjan", 25, 12));
		students.add(new Undergrad("Samita", "Maharjan", 25, 12));
		students.add(new Grad("Shreeja", "Shrestha", 200));
		students.add(new Grad("Shreeja", "Shrestha", 200));
		
		Iterator<Student> stu = students.iterator();
		
		while(stu.hasNext()) {
			double salary = stu.next().getPay();
			totalSalary += salary;
		}
		System.out.println("The total salary is "+ totalSalary);
	}
}
