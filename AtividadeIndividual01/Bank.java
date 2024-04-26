import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
  
    Lock lock = new ReentrantLock();

    void transfer(Account sender, Account receiver, Double ammount, String senderName, String receiverName){
        
        //Block the acess to only one thread make a transfer action

        lock.lock();

        try{
            //Check if the sender balance is bigger than the ammount that will send.
            if (sender.getBalance() >= ammount){
                System.out.println("Destinatário : " + receiverName);
                System.out.println("Remetende : " + senderName);
                System.out.println("Comprovante de transferencia: ");
                System.out.println("-------------------------------------------------------");
                System.out.println("Salario do remetente : "  + sender.getBalance());
                System.out.println("Salario do destinarario : "  + receiver.getBalance());
                System.out.println("Valor da transferencia : "  + ammount);
                System.out.println("-------------------------------------------------------");
                System.out.println("\n");
        
                sender.spendBalance(ammount);
                receiver.gainBalance(ammount);
            }
        }finally{
            //Free the current thread and maje ter transfer method available to another thread
            lock.unlock();
        }
        
        
    }
}