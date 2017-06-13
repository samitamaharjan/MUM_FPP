package person7_6_case3;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
		
	public static void main(String[] args) {
		GregorianCalendar dateOfBirth = new GregorianCalendar(2014, 6, 6);
		PersonWithJob p3 = new PersonWithJob(new Person("Samita", dateOfBirth), 1500);
		
		GregorianCalendar dateOfBirth1 = new GregorianCalendar(2014, 6, 6);
		PersonWithJob p4 = new PersonWithJob(new Person("Samita", dateOfBirth1), 1500);
		
		System.out.println(p3.equals(p4));
	
	
	}

}
