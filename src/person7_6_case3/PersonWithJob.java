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
		
		return person.getName().equals(p.person.getName())
				&& person.getDateOfBirth().equals(p.person.getDateOfBirth())
				&& p.salary == salary;
	}
}
