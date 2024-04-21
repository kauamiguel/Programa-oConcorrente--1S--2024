import java.util.concurrent.ThreadLocalRandom;

public class Receiver extends Thread{
    private Data packet;

    public Receiver(Data packet){
        this.packet = packet;
    }

    public void run(){
        while(true){
            String message = this.packet.receive();
            System.out.println("Mensagem recebida " + message);

            if (message == "END"){
                break;
            }

            int randomValue = ThreadLocalRandom.current().nextInt(3000, 7000);

            try {
                Thread.sleep(randomValue);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
