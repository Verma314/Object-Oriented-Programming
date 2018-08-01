package blockingqtest;


import java.util.AbstractQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;


//remember that conncurrent hash map  are the better ones
class Producer implements Runnable {

    private final BlockingQueue queue;
    Producer(BlockingQueue q) { queue = q; }

    public void run() {
        try {
            while (true) {
                queue.put(1);
                System.out.println("adding elements, size = " + queue.size());
            }
        } catch (InterruptedException ex) { }
    }
}

class Consumer implements Runnable {
    private final BlockingQueue queue;
    Consumer(BlockingQueue q) { queue = q; }
    public void run() {
        try {
            while (true) {
                queue.take();
                System.out.println("removing elements, size = " + queue.size());
            }
        } catch (InterruptedException ex) { }
    }

}



public class Blocking {
    static Producer p;
    static Consumer c1,c2;
    public static void main (String [] args) {
        Blocking b =new Blocking();
        BlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(10);
        p = new Producer(q);
        c1 = new Consumer(q);
        c2 = new Consumer(q);


        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
}
