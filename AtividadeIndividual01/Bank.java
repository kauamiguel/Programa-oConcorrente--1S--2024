public class Bank {
  
    void transfer(Account sender, Account receiver, Double ammount){
        if (sender.getBalance() == 0){
            System.out.println("O destinatario nao tem saldo suficiente. ");
            return;
        }

        sender.spendBalance(ammount);
        receiver.gainBalance(ammount);
    }
}