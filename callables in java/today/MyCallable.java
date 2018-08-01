package today;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class MyCallable implements Callable<Integer> {
        Integer given;

        public MyCallable( Integer given ) {
            this.given = given;
        }

        public Integer call() throws InterruptedException {
            Thread.sleep(2000);
            return  given * 2;

        }
}
