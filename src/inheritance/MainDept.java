package inheritance;

import java.util.Scanner;

public class MainDept {

	public static void main(String[] args) {
		Professor prof1 = new Professor("Micha", "06/15/2014", 300, 10);
		Professor prof2 = new Professor("Mc Clain", "06/15/2013", 300, 10);
		Professor prof3 = new Professor("Alex", "06/05/2015", 300, 10);
		
		Secretary secret1 = new Secretary("Hannah", "05/25/2012", 300, 200);
		Secretary secret2 = new Secretary("Alice", "10/22/2016", 300, 200);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = secret1;
		department[4] = secret2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to see the sum of all salaries in the department");
		String str = sc.nextLine();
		if (str.equalsIgnoreCase("Y")) {
			int sum = 0;
			for (DeptEmployee dept : department) {
				sum += dept.computeSalary();
			}
			System.out.println("The sum of the salaries = " + sum);
		} 
		System.out.println("Thank you!");
		sc.close();
	}

}
