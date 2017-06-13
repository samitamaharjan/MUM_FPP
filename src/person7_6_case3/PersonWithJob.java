package person7_6_case3;

public class PersonWithJob {
	private double salary;
	Person person;
	PersonWithJob(Person person, double salary) {
		this.person = person;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)ob;
		
		return p.person.equals(this.person)
				&& p.salary == salary;
	}
}
