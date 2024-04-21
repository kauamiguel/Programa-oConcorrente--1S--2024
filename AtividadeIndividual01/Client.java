public class Client extends Thread{

    Bank bank;
    Account account;

    public Client(){
        this.bank = new Bank();
        this.account = new Account();
        this.account.gainBalance(1000.00);
    }

    void buy(Store store, Double ammount){
        bank.transfer(this.account, store.account, ammount);
    }
    
}
