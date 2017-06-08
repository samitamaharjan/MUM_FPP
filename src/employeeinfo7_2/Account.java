package employeeinfo7_2;

class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		this.employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public AccountType getAccType() {
		return acctType;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public String toString() {
		return String.format("Account type: %s%nCurrent bal:  %.1f%n", acctType.toString(), balance);
	}

	public void makeDeposit(double deposit) {
		balance = balance + deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > balance) return false;
		balance = balance - amount;
		return true;
	}
}
