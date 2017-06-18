package program_testNov2016.prob2_modified;

public final class Teacher extends EmployeeData {
	private double bonus;
	
	public Teacher(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + bonus;
	}
}
