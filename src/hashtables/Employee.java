package hashtables;

import java.util.HashMap;
import java.util.Set;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord = new HashMap<>();
	
	public void addEntry(String date, double salary) {
		salaryRecord.put(date, salary);
	}
	
	public void printPaymentAmount(String date) {
		String s = "";
		if (salaryRecord.get(date) == null) {
			s += String.format("%s %s did not receive a paycheck on %s",
					getFirstName(), getLastName(), date);
		} else 		
			s += String.format("%s %s was paid %.1f on %s",
					getFirstName(), getLastName(), salaryRecord.get(date), date);
		
		System.out.println(s);
	}
	
	public void printAveragePaycheck() {
		double total = 0;
		Set<String> commonKeySet = salaryRecord.keySet();
		for (String key : commonKeySet) {
			total += salaryRecord.get(key);
		}
		double avgSal = total / commonKeySet.size();
		
		String s = String.format("Average paycheck for %s %s was %.1f",
				getFirstName(), getLastName(), avgSal);
		
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
