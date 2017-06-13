package collection.comparable_student;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudent {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Undergrad("Samita", "Maharjan", 25, 12));
		students.add(new Undergrad("James", "Singh", 25, 12));
		students.add(new Undergrad("Meera", "Amatya", 25, 12));
		students.add(new Grad("Shreeja", "Shrestha", 200));
		students.add(new Grad("Nirvik", "Dangol", 200));
		
		Collections.sort(students);
		System.out.println(students);
	}
}
