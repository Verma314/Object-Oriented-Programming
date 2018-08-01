package threadsonfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class ThreadOnFile implements Callable<String>{
    File file;
    String word;
    public ThreadOnFile (File file, String word) {
        this.file = file;
        this.word = word;
    }

    public String call () throws FileNotFoundException{
        Scanner sc = new Scanner(file);
        boolean flag = false;
        while (sc.hasNextLine()) {
            String [] line = sc.nextLine().split(" ");

            for ( int i = 0 ; i < line.length ; i++) {
                if ( line[i].equals(word)) {
                    flag = true;
                    return "" + this.file;
                }
            }
        }
        return "";
    }
}
