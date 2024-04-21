public class Data {
    private String message;
    private Boolean isSending = true;

    public synchronized void send(String message){

        while(!isSending){
            try{
                wait();
            }catch(InterruptedException error){
                System.err.println(error);
            }
        }
        this.message = message;

        this.isSending = false;

        //Send notify to receive
        notify();
    }

    public synchronized String receive(){

        while (isSending) {
            try{
                wait();
            }catch(InterruptedException error){
                System.out.println(error);
            }
        }

        this.isSending = true;

        notify();

        return this.message;
    }
}
