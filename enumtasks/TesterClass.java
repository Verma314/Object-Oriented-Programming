package enumtasks;

import java.util.ArrayList;

public class TesterClass {

    public static void main (String [] args ) {

        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(new Task ( Status.OPEN, 1));
        taskList.add(new Task ( Status.OPEN, 2));
        taskList.add(new Task ( Status.CLOSED, 3));
        taskList.add(new Task ( Status.OPEN, 4));

        System.out.println(taskList.stream().
                        filter( task -> task.status == Status.OPEN).
                        map( task -> task.points).
                        reduce( (x,y) -> x + y));


    }
}
