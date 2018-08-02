package streamtests;

import java.util.*;

public class PrintNumbersFilter {

    public static void main ( String [] args ) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 100;
        while ( i-- > 0) {
            list.add(i);
        }

        final int cap = 80;
        list.parallelStream()
                .filter( x -> x > cap)  //filter takes a predicate (a condition)
                .forEach( x -> System.out.println(x));


    }
}
