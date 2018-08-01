package threadsonfiles;


import java.io.File;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.concurrent.*;

public class TestThreadPoolDemo {
    public static void main (String [] args ) throws ExecutionException,InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);
        CompletionService executorCompletionService= new ExecutorCompletionService<>(service );
        ArrayList<Future<String>> listOfFutures = new ArrayList<>();


        //adding files to search
        ArrayList<File> listOFiles = new ArrayList<>();
        listOFiles.add(new File("C:\\Windows\\system32\\config\\systemprofile\\Desktop\\test\\a.txt"));
        listOFiles.add(new File("C:\\Windows\\system32\\config\\systemprofile\\Desktop\\test\\b.txt"));
        listOFiles.add(new File("C:\\Windows\\system32\\config\\systemprofile\\Desktop\\test\\c.txt"));

        //submit the tasks to the futures
        for ( File file : listOFiles) {
            //searching for my name. replace the word you want to search here:
            Callable<String> task = new ThreadOnFile(file, "aditya");
            Future<String> future = executorCompletionService.submit(task);
            listOfFutures.add(future);
        }


        for ( Future future : listOfFutures) {
            String result =  (String) future.get();  //get is a blocking call
            if ( !result.equals("")) {
                System.out.println("found in " + result);
            }
        }




    }


}
