package program_testJan2017.prob2_solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double totalSalary = 0;
		for (Employee emp : emps) {
			for (Account account : emp.accounts) {
				totalSalary += account.getBalance();
			}
		}
		return totalSalary;
	}
}
