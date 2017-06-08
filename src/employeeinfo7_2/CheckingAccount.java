package employeeinfo7_2;

public class CheckingAccount extends Account {
	
	public CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	@Override
	public double getBalance() {
		deduct(5); // $5 charge for reading balance
		return super.getBalance();
	}
	
	public AccountType getAccountType() {
		return AccountType.CHECKING;
	}

}
