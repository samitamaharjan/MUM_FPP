package inheritance;

public class MainStudent {

	public static void main(String[] args) {
		Student undergrad = new Undergrad("Samita", "Maharjan", 25, 12);
		undergrad.printData();
		
		Student grad = new Grad("Shreeja", "Shrestha", 200);
		grad.printData();
	}

}
