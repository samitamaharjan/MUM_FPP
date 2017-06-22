package program_testNov2016.prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		List<Employee> empList = new ArrayList<>();
		
		/*for (String keyList : table.keySet()) {
			Employee emp = table.get(keyList);
			if (emp.getSalary() > 80000) {
				empList.add(emp);
			}
		}*/
		for (Employee emp : table.values()) {
			int salary = emp.getSalary();
			if (salary > 80000) {
				empList.add(emp)
;			}
		}
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSsn().compareTo(e2.getSsn());
			}
		});
		return empList;
	}
}
