package collection.comparator_student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainStudent {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Undergrad("Samita", "Maharjan", 25, 15));
		students.add(new Undergrad("James", "Singh", 50, 12));
		students.add(new Undergrad("Meera", "Amatya", 25, 12));
		students.add(new Grad("Shreeja", "Shrestha", 150));
		students.add(new Grad("Nirvik", "Dangol", 400));
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
            public int compare(Student s1, Student s2) {
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
        });
		
		System.out.println("Sort by firstName");
		System.out.println(students);
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getLastName().compareTo(s2.getLastName());
			}
		});
		
		System.out.println("Sort by lastName");
		System.out.println(students);
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
            public int compare(Student s1, Student s2) {
                return (int)(s1.getPay() - s2.getPay());
            }
        });
		
		System.out.println("Sort by salary");
		System.out.println(students);
	}
}
