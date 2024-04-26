import java.util.Random;

import javax.management.RuntimeErrorException;

public class Client extends Thread{

    Bank bank;
    Account account;
    Store store1;
    Store store2;
    String name;
    Random random = new Random();

    public Client(Bank bank, Store store1, Store store2, String name){
        this.bank = bank;
        try {
            this.account = new Account();    
        } catch (Exception e) {
            System.out.println("Problema ao criar a conta na classe cliente.");
        }
        
        this.account.gainBalance(1000.0);
        this.store1 = store1;
        this.store2 = store2;
        this.name = name;
    }

    public void run(){
        
        while (this.account.getBalance() > 0.00){

            Double transferAmmount = random.nextInt(2) == 0 ? 100.00 : 200.00;
            Store randomStore = random.nextInt(2) == 0 ? this.store1 : this.store2;
            bank.transfer(this.account, randomStore.account, transferAmmount, this.name, randomStore.storeName);
        }
    }
    
}
