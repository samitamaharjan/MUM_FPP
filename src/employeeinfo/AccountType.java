package employeeinfo;

public enum AccountType {
	SAVINGS("savings"), CHECKING("checking"), RETIREMENT("retirement");
	
	private String name;
	
	private AccountType(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
