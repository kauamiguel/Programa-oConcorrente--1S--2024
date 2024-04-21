public class Account {
    private Double balance;

    Double getBalance(){
        return this.balance;
    }

    void spendBalance(Double value){
        this.balance -= value;
    }

    void gainBalance(Double value){
        this.balance += value;
    }
}
