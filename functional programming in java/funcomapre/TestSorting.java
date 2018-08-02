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
/*
        for ( Employee e : employeeList ) {
            System.out.print( e.lastName+ " ");
        }
*/

        System.out.println();
/*        Collections.sort(employeeList,new Comparator<Employee>() {
            @Override
            public int compare(Employee s1, Employee s2) {
                return s1.getLastName().compareToIgnoreCase(s2.getLastName());
            }
        });*/

        Collections.sort(employeeList, (e01,e02) -> e01.getLastName().compareTo(e02.lastName));

        displayLists(employeeList);
/*        for ( Employee e : employeeList ) {
            System.out.print( e.lastName + " ");
        }*/

    }
}
