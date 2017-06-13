package collection.iterator_student;

public class Undergrad extends Student{
	private int underWage;
	private int underHours;
	
	public Undergrad(String firstName, String lastName, int underWage, int underHours) {
		super(firstName, lastName);
		this.underWage = underWage;
		this.underHours = underHours;
	}

	public int getUnderWage() {
		return underWage;
	}

	public int getUnderHours() {
		return underHours;
	}
	
	@Override
	public double getPay() {
		return getUnderWage() * getUnderHours();
	}
	
	@Override
	public void printData() {
		super.printData();
		System.out.println("Weekly salary = " + getPay() * 40);
	}
}
