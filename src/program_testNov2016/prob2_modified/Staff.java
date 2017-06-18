package program_testNov2016.prob2_modified;

public final class Staff extends EmployeeData {
	private int numDependants;
	
	public Staff(String name, double salary, int numDependants) {
		super(name, salary);
		this.numDependants = numDependants;
	}
	
	public int getNumDependants() {
		return numDependants;
	}
}
