import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Store {
    Account account;
    Bank bank;
    Employee firstEmployee;
    Employee secondEmployee;
    String storeName;

    public Store(Bank bank, String storeName){
        try {
            this.account = new Account();    
        } catch (Exception e) {
            System.out.println("Problema ao criar a conta na classe Loja.");
        }
        
        this.account.gainBalance(0.0);
        this.bank = bank;
        this.storeName = storeName;
        this.firstEmployee = new Employee(bank, "Primeiro funcionario da loja " + this.storeName);
        this.secondEmployee = new Employee(bank, "Segundo funcionario da loja " + this.storeName);
        
        //This logic create an observable to check if this account has 1400 in balance and then pay one employeer
        this.account.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals("payed")) {
                    if (account.getBalance() >= 1400) {
                        payEmployee();
                    }
                }
            }
        });
    }


    void payEmployee(){
        
        if (this.account.getBalance() >= 1400){
            System.out.println("Loja " + this.storeName + " com 1400 na conta.");
            System.out.println("Pagando o funcionario: " + firstEmployee.name);
            System.out.println("\n");


            //Check wich emplyer has more money to be payed
            if (this.firstEmployee.accountSalary.getBalance() > this.secondEmployee.accountSalary.getBalance()){
                bank.transfer(this.account, this.secondEmployee.accountSalary, 1400.00, this.storeName, this.secondEmployee.name);
                this.secondEmployee.investMoney();
            }else{
                bank.transfer(this.account, this.firstEmployee.accountSalary, 1400.00, this.storeName, this.firstEmployee.name);
                this.firstEmployee.investMoney();
            }
        }
    }
}
