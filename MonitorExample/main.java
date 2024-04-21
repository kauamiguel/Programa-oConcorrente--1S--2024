public class main {
    public static void main(String[] args){
        Data packet = new Data();
        String[] messages = {
            "Primeira mensagem",
            "Segunda mensagem",
            "Terceira mensagem",
            "Quarta mensagem",
            "END"
        };

        Sender sender = new Sender(packet, messages);
        Receiver receiver = new Receiver(packet);

        sender.start();
        receiver.start();
    }
}
