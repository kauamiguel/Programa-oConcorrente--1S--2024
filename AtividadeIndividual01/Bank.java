import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
  
    Lock lock = new ReentrantLock();

    void transfer(Account sender, Account receiver, Double ammount, String senderName, String receiverName){
        
        lock.lock();
        
        try{
           
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
            lock.unlock();
        }
        
        
    }
}