package polymerphism;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee {
	// instance fields

	private String name;
	private double salary;
	private Date hireDay;

	// constructor
	Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		name = aName;
		salary = aSalary;
		GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = cal.getTime();
	}

	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public void setBonus(int i) {
		// TODO Auto-generated method stub

	}

}

class Manager extends Employee {
	// private
	double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 83;
	}

	@Override
	public double getSalary() {
		// no direct access to private variables of superclass
		System.out.println("When will this be called");
		double baseSalary = super.getSalary();
		System.out.println("Base salary is " + baseSalary);
		System.out.println("Bonus is " + bonus);
		System.out.println("With bonus salary is " + (baseSalary + bonus));
		return baseSalary + bonus;
	}

	public double setBonus(double b) {
		bonus = b;
		System.out.println("b is the value"+b);
		return bonus;
	}
}

class ManagerTest1 {
	// Inheritance Example
	public static void main(String[] args) {
		Manager boss = new Manager("Boss Guy", 80000, 2009, 12, 15);
		
		Employee[] staff = new Employee[4];

		staff[0] = boss;
		staff[1] = new Employee("Jimbo", 50000, 2012, 10, 1);
		staff[2] = new Employee("Tommy", 40000, 2013, 3, 15);
		staff[3] = new Employee("Employee Mgr", 40000, 2013, 3, 15);
		boss.setBonus(98);
		
		System.out.println("Name: " + boss.getName() + "\nSalary: "
				+ boss.getSalary() + "\nHire Day :" + boss.getHireDay());
		
		Manager eMgr=(Manager) staff[0];
		System.out.println("Name: " + eMgr.getName() + "\nSalary: "
				+ eMgr.getSalary() + "\nHire Day :" + eMgr.getHireDay());
		
		// print names and salaries 
		for(Employee e : staff) {
		 System.out.println("Name: " + e.getName() + "\nSalary: "+
		 e.getSalary() + "\nHire Day :" + e.getHireDay()); }
		
		
		Employee emp = new Manager("Sam", 15000, 2015, 05, 25);
		Employee[] empArr = new Employee[4];
		
	}

}
