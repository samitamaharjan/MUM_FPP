package employeeinfo;

import java.time.LocalDate;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	
	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING, startAmount);	
	}

	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("ACCOUNT INFO FOR %s:%n%n", this.name));
		
		if (checkingAcct != null) {
			sb.append(checkingAcct.toString());
		}
		
		if(savingsAcct != null) {
			sb.append(savingsAcct.toString());
		}
		
		if(retirementAcct != null) {
			sb.append(retirementAcct.toString());	
		}
		sb.append("\n");
		
		return sb.toString();
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public void deposit(AccountType acctType, double amt){
		if (checkingAcct != null && acctType == AccountType.CHECKING) {
			checkingAcct.makeDeposit(amt);
		} else if (savingsAcct != null && acctType == AccountType.SAVINGS) {
			savingsAcct.makeDeposit(amt);
		} else if (retirementAcct != null && acctType == AccountType.RETIREMENT) {
			retirementAcct.makeDeposit(amt);
		}
	}
	
	public boolean withdraw(AccountType acctType, double amt){
		if (checkingAcct != null && acctType == AccountType.CHECKING) {
			checkingAcct.makeWithdrawal(amt);
			return true;
		} else if (savingsAcct != null && acctType == AccountType.SAVINGS) {
			savingsAcct.makeWithdrawal(amt);
			return true;			
		} else if (retirementAcct != null && acctType == AccountType.RETIREMENT) {
			retirementAcct.makeWithdrawal(amt);
			return true;
		}
		return false;
	}
}
