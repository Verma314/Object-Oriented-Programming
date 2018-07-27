package innerclasses;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class SalaryComparatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Test
	public void testCompare() {
		 Employee e1,e2,e3;
		 ArrayList<Employee> list0 = new ArrayList<>();
		 e1 = new Employee(1, 5000, "A");
		 e2 = new Employee(2, 1000, "A2");
		 e3 = new Employee(3,10000, "A3");
		 list0.add(e1);
		 list0.add(e2);
		 list0.add(e3);
		SortEmployees se = new SortEmployees();
		System.out.println(list0);
		se.sortBySal(list0);
		System.out.println(list0);
	}

}
