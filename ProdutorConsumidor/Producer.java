import java.util.Random;

public class Producer extends Thread {
    private Buffer buffer;

    Producer(Buffer buffer, String name){
        super(name);
        this.buffer = buffer;
    }

    public void run(){
        //Consumir de 1 a 5 produtos
        int numProducts = new Random().nextInt(5) + 1;

        System.out.println(this.getName() + " Produziu " + numProducts);
        for(int i  = 0; i < numProducts; i++){
            this.produce();
        }

        System.out.println(this.getName() + " Teminou a producao");
    }

    public void produce(){

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Thead foi interrompida " + e);
        }

        int product = new Random().nextInt(1000);
        this.buffer.add(product);
    }
}
