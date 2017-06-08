package employeeinfo7_2;

public class SavingAccount extends Account{

	public SavingAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	
	@Override
	public double getBalance() {
		deduct(0.25 / 100 * super.getBalance()); // 0.25% monthly interest rate is applied
		return super.getBalance();
	}
	
	public AccountType getAccountType() {
		return AccountType.SAVINGS;
	}
}
