package employeeinfo7_3;

import java.time.LocalDate;

public class Employee {

	private String name;
	private LocalDate hireDate;
	private AccountList accountList = new AccountList();
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	
	public void createNewChecking(double startAmount) {
		Account checkingAcct = new CheckingAccount(this, startAmount);	
		accountList.add(checkingAcct);
	}

	public void createNewSavings(double startAmount) {
		Account savingsAcct = new SavingAccount(this, startAmount);
		accountList.add(savingsAcct);
	}

	public void createNewRetirement(double startAmount) {
		Account retirementAcct = new RetirementAccount(this, startAmount);
		accountList.add(retirementAcct);
	}

	public String getFormattedAcctInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("ACCOUNT INFO FOR %s:%n%n", this.name));
		
		for (int i = 0; i < accountList.size(); i++) {
			Account acc = accountList.get(i); // retrieve account object from index i
			sb.append(acc.toString()); 
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public void deposit(int accountIndex, double amt){
		Account account = accountList.get(accountIndex);
		account.makeDeposit(amt);		
	}
	
	public boolean withdraw(int accountIndex, double amt){
		Account account = accountList.get(accountIndex);
		return account.makeWithdrawal(amt);
	}
}
