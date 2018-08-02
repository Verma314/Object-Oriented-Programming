package funcomapre;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
        printConditionally(employeeList, (e) -> e.getLastName().startsWith("z"));
        printConditionallyUsingLibrary(employeeList, (e) -> e.getLastName().startsWith("z"));
        printConditionallyUsingLibrary(employeeList, (e) -> e.getLastName().startsWith("z"), (e) -> System.out.println(e.getLastName()));
    }

    public static void printConditionally(List<Employee> employees, Condition condition){
        for(Employee e: employees){
            if(condition.test(e)){
                System.out.println("\nsatisifying condition " + e.getLastName());
            }

        }
    }

    //predicate is a built-in interface
    public static void printConditionallyUsingLibrary(List<Employee> employees, Predicate<Employee> predicate,
                                                      Consumer<Employee> consumer){
        for(Employee e: employees){
            if(predicate.test(e)){
               consumer.accept(e); //consumer is an implementation of accept method
            }

        }
    }


    public static void printConditionallyUsingLibrary(List<Employee> employees, Predicate<Employee> predicate){
        for(Employee e: employees){
            if(predicate.test(e)){
                System.out.println("\nsatisifying condition (lib) " + e.getLastName());
            }

        }
    }

}
