package innerclasses;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployees {
	
	public List<Employee> sortBySal  ( List<Employee> employees ) {
		Collections.sort( employees, new Comparator<Employee>() {
			
			@Override
			public int compare ( Employee o1, Employee o2) {
				return o1.salary.compareTo(o2.salary);
			}
			
		});
				
		
		
		//or:
	//	Collections.sort(employees, new SalaryComparator());
		
		
		
		return employees;	
	}

}
