package today;

import java.util.concurrent.*;
import java.util.*;

public class CallableDemo {
    public static void main (String [] args ) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2);


        ArrayList<Future<Integer>> listOfFutures = new ArrayList<>();

        for ( int i = 0 ; i < 10 ; i++ ) {
            Callable<Integer> task = new MyCallable(new Integer(i));
            Future<Integer> future = service.submit(task);
            listOfFutures.add(future);
        }

        int sum = 0;
        for ( Future future : listOfFutures) {
            Integer result =  (Integer) future.get();  //get is a blocking call
            sum += result;
            System.out.println(result);
        }
        System.out.println("sum of x 2 numbers is " + sum);




    }


}
