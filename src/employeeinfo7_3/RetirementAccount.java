package employeeinfo7_3;

public class RetirementAccount extends Account {

	public RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	public AccountType getAccountType() {
		return AccountType.RETIREMENT;
	}

	@Override
	public boolean makeWithdrawal(double amount) {
		return super.makeWithdrawal(amount + (0.2 / 100) * amount); // 2% penalty is applied to the balance
	}
}
