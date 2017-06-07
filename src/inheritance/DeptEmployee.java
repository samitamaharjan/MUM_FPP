package inheritance;

public class DeptEmployee {
	private String name;
	private String hiredate;
	private double salary;
	
	public DeptEmployee(String name, String hiredate, double salary) {
		this.name = name;
		this.hiredate = hiredate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	public double computeSalary() {
		return salary;
	}
}
