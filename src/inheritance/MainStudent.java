package inheritance;

public class MainStudent {

	public static void main(String[] args) {
		double totalSalary = 0;
		Student[] students = {new Undergrad("Samita", "Maharjan", 25, 12),
				new Undergrad("Samita", "Maharjan", 25, 12),
				new Undergrad("Samita", "Maharjan", 25, 12),
				new Grad("Shreeja", "Shrestha", 200),
				new Grad("Shreeja", "Shrestha", 200),
				new Grad("Shreeja", "Shrestha", 200)};
		
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
