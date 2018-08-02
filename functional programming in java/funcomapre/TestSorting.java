package funcomapre;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class TestSorting {
    public  static void displayLists (ArrayList<Employee> employeeList) {
        for ( Employee e : employeeList ) {
            System.out.print( e.lastName+ " ");
        }
    }
    public static  void main(String [] args ) {
        Employee e1 = new Employee("aaa", "zzzbbbb");
        Employee e2 = new Employee("aDFaa", "bbbSDFb");
        Employee e3 = new Employee("XFAAWD", "aaaSDA");

        ArrayList<Employee> employeeList = new  ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);


        displayLists(employeeList);
        System.out.println();
        Collections.sort(employeeList, (e01,e02) -> e01.getLastName().compareTo(e02.lastName));
        displayLists(employeeList);
        //do conditions, similar to filter-ish
        printConditionally(employeeList, (e) -> e.getLastName().startsWith("z")); //print last names starting with z


    }

    public static void printConditionally(List<Employee> employees, Condition condition){
        for(Employee e: employees){
            if(condition.test(e)){
                System.out.println("\nsatisifying condition " + e.getLastName());
            }

        }
    }


}
