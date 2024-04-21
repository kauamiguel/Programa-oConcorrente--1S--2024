public class Store {
    Account account;
    Bank bank;
    Employee firstEmployee;
    Employee secondEmployee;

    public Store(){
        this.account = new Account();
        this.account.gainBalance(0.0);
        this.bank = new Bank();
        this.firstEmployee = new Employee();
        this.secondEmployee = new Employee();
    }

    void payEmployee(){
        if (this.account.getBalance() == 1400){
            bank.transfer(this.account, this.firstEmployee.accountSalary, 700.00);
            bank.transfer(this.account, this.secondEmployee.accountSalary, 700.00);
        }
    }
}
