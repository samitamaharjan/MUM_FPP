package person7_6_case2;

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
		if(ob.getClass() != this.getClass()) return false;
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
		GregorianCalendar dateOfBirth2 = new GregorianCalendar(2014, 5, 6);
		PersonWithJob p3 = new PersonWithJob("Samita", dateOfBirth2, 1500);
		
		GregorianCalendar dateOfBirth3 = new GregorianCalendar(2014, 5, 6);
		PersonWithJob p4 = new PersonWithJob("Samita", dateOfBirth3, 1500);
		System.out.println(p3.equals(p4));
	
	
	}

}
