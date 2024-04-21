public class Employee extends Thread{
    Account accountSalary;
    private Account accountInvestment;
    Bank bank;

    public Employee(){
        this.accountInvestment = new Account();
        this.accountSalary = new Account();
        this.accountInvestment.gainBalance(0.0);
        this.accountSalary.gainBalance(0.0);
        this.bank = new Bank();
    }

    void investMoney(){
        accountInvestment.gainBalance(this.accountSalary.getBalance() * 0.2);
    }
}
