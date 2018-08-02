package functional;

import java.util.ArrayList;
import java.util.List;

public class TestGreeter {
    public static void main ( String [] args ) {
        Greeter g = new Greeter();
        Igreeting jap = new JapGreeting();
        //Igreeting frenchGreeting = () -> System.out.println("welcome to lambda");


        //StringToInt len = ((m) -> m.length());
        //System.out.println( "length is : " + len.calculateLength("hiiiiii"));


        ListLength len2 = ( m -> m.size());
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println( "length of list is : " + len2.calculateLength(list));

        List<String> list2 = new ArrayList<>();
        list2.add("aas");
        list2.add("aass");
        System.out.println( "length of list is : " + len2.calculateLength(list2));





        //g.greet(frenchGreeting);
       // g.greet(jap);
    }
}
