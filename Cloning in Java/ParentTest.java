import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ParentTest {

	@Test
	public void testDeepCloning() throws CloneNotSupportedException {
			Parent p0 = new Parent("abc",1);
			Parent p1 = p0.clone();
			
			
			
			assertEquals(p0,p1);
			
	}

	
	
	
	
	
	
	
/*	@Test
	public void testPerformanceDeepCloning() throws CloneNotSupportedException  {
			Parent p0 = new Parent("abc",1);
			List<Parent> listOfParentClass = new ArrayList<>();
			Parent p1;
			int i = 100;
			long startTime = System.nanoTime();
			
			while ( i --> 0 ) 
				listOfParentClass.add( p0.clone());

			long endTime = System.nanoTime();
			
			System.out.println( "clone time for deep cloning " + (endTime - startTime));
			
	}
	*/
	
	
	
	
/*	@Test
	public void testPerformanceConstructor() throws CloneNotSupportedException  {
			Parent p0 = new Parent("abc",1);
			List<Parent> listOfParentClass = new ArrayList<>();
			Parent p1;
			int i = 100;
			long startTime = System.nanoTime();
			
			while ( i --> 0 ) 
				listOfParentClass.add(new Parent(p0) );

			long endTime = System.nanoTime();
			
			System.out.println( "clone time for constructor: " + (endTime - startTime));
			
	}*/
}
