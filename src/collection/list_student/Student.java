package collection.list_student;

public class Student {
	private String firstName;
	private String lastName;
		
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void printData(){
		System.out.printf("Student name: %s %s%n", getFirstName(), getLastName());
	}
}
