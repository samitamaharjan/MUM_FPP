package program_testNov2016.prob2_modified;

abstract class EmployeeData {
	private String name;
	private double salary;
	
	public EmployeeData(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
}
