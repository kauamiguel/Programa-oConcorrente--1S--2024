import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Buffer {
        private Queue<Integer> buffer;
        private Lock lock;
        private Condition bufferNotFull;
        private Condition bufferNotEmpty;
        static Integer MAX_CAPACITY = 10;

    Buffer(Queue<Integer> buffer, Lock lock){
        this.buffer = buffer;
        this.lock = lock;
        this.bufferNotFull = this.lock.newCondition();
        this.bufferNotEmpty = this.lock.newCondition();
    }

    public void add(Integer product){
        this.lock.lock();

        //Enqautno tiver cheio espera
        while (this.buffer.size() == MAX_CAPACITY){
            try {
                this.bufferNotFull.await();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            
        }

        System.out.println("Adicionando o produto... ");
        this.buffer.add(product);

        //Indica que há produto para consumir
        this.bufferNotEmpty.signalAll();

        this.lock.unlock();
    }

    public void remove(){
        this.lock.lock();

        //Enqautno tiver cheio espera
        while (this.buffer.size() == 0){
            try {
                this.bufferNotEmpty.await();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            
        }

        System.out.println("Adicionando o produto... ");
        this.buffer.remove();

        //Indica que há espaçø na lista
        this.bufferNotEmpty.signalAll();

        this.lock.unlock();
    }
}
