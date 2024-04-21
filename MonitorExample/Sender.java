import java.util.concurrent.ThreadLocalRandom;

public class Sender extends Thread{
    private Data packet;
    private String[] messages;

    public Sender(Data packet, String[] message){
        this.packet = packet;
        this.messages = message;
    }


    public void run(){
        for(String message: this.messages){

            System.out.println("Mensagem Enviada " + message);
            this.packet.send(message);

            int randomValue = ThreadLocalRandom.current().nextInt(3000, 7000);

            try {
                Thread.sleep(randomValue);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
