package employeeinfo7_2;

abstract class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	
	private double balance;
	private AccountType acctType;
	private Employee employee;

	public Account(Employee emp, double balance) {
		this.employee = emp;
		this.balance = balance;
	}

	public Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
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
	
	public void deduct(double amount) {
		makeWithdrawal(amount);
	}
	
	public abstract AccountType getAccountType();
}
