package inheritance;

public class Grad extends Student{
	private double gradSalary;
	
	public Grad(String firstName, String lastName, double gradSalary) {
		super(firstName, lastName);
		this.gradSalary = gradSalary;
	}

	public double getPay() {
		return gradSalary;
	}
	
	@Override
	public void printData() {
		super.printData();
		System.out.println("Monthly pay = " + getPay());
	}
}
