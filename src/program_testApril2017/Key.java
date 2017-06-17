package program_testApril2017;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public String toString() {
		return String.format("[%s %s]", getFirstName(), getLastName());
	}
	
	@Override
	public boolean equals(Object ob) {
		if (ob == null || !(ob instanceof Key)) return false;
		Key keyOb = (Key) ob;
		return keyOb.firstName.equals(this.firstName) 
				&& keyOb.lastName.equals(this.lastName);
	}
	
	@Override
	public int hashCode() {
		int result = 17; //seed
		int hashFirst = firstName.hashCode();
		int hashLast = lastName.hashCode();
		result += 31 * result + hashFirst;
		result += 31 * result + hashLast;
		return result;
		
	}
}
