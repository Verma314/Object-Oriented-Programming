package innerclasses;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		return  arg0.salary.compareTo(arg1.salary) ;

	}

}
