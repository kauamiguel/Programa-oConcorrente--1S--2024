import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;

class main{

    private static int NUM_PRODUCER = 4;
    private static int NUM_CONSUMER = 2;

    public static void main(String[] args) {
        Queue<Integer> productsqQueue = new LinkedList<Integer>();
        ReentrantLock lock = new ReentrantLock();
        Buffer buffer = new Buffer(productsqQueue, lock);

        for(int i = 0; i < NUM_PRODUCER; i++){
            new Producer(buffer, "Produtor " + (i + 1)).start();
            new Consumer(buffer, "Consumor " + (i + 1)).start();
        }
    }
}