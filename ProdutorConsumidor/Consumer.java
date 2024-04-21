import java.util.Random;

public class Consumer extends Thread{
    
    private Buffer buffer;

    Consumer(Buffer buffer, String name){
        super(name);
        this.buffer = buffer;
    }

    public void run(){
        //Consumir de 1 a 5 produtos
        int numProducts = new Random().nextInt(5);

        System.out.println(this.getName() + " Consumiu " + numProducts);
        for(int i  = 0; i < numProducts; i++){
            this.consume();
        }

        System.out.println(this.getName() + " Teminou o consumo");
    }

    public void consume(){

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Thead foi interrompida " + e);
        }

        this.buffer.remove();
    }
}
