package inheritance;

public class Professor extends DeptEmployee {
	private int numberOfPublications;
	
	public Professor(String name, String hiredate, double salary, int numberOfPublications) {
		super(name, hiredate, salary);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
