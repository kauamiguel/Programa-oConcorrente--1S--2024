public class Incremento extends Thread{
    private Contador counter;

    public Incremento(Contador counter){
        this.counter = counter;
    }

    public void run(){
        System.out.println(this.getName() + "Incremendanto contador");
        this.counter.increment();
    }
}