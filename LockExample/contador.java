import java.util.concurrent.locks.Lock;

class Contador{
    private Integer value;
    private Lock lock;

    public Contador(Integer value, Lock Lock){
        this.value = value;
        this.lock = lock;
    }

    public void increment(){
        //Bloqueando a lock, apenas uma thread por vez acessa o codigo abaixo
        this.lock.lock();


        this.value ++;

        System.out.println("Incremenetando o valor para :  " + this.value);
        System.out.println("Saindo do metodo increment...");

        this.lock.unlock();
    }

    public Integer getValue(){
        return this.value;
    }
}