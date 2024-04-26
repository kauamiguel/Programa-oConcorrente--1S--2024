public class Employee extends Thread{
    Account accountSalary;
    Account accountInvestment;
    Bank bank;
    String name;
    

    public Employee(Bank bank, String name){
        try {
            this.accountInvestment = new Account();
            this.accountSalary = new Account();
        } catch (Exception e) {
            System.out.println("Problema ao criar a conta na classe Empregado.");
        }
        
        this.accountSalary.gainBalance(0.0);;
        this.accountInvestment.gainBalance(0.0);;
        this.bank = bank;
        this.name = name;
    }

    
    void investMoney(){
        System.out.println("Investindo 20% da conta , no total de: " + this.accountSalary.getBalance() * 0.2);
        System.out.println("\n");
        accountInvestment.gainBalance(this.accountSalary.getBalance() * 0.2);
        accountSalary.spendBalance(this.accountSalary.getBalance() * 0.2);
    }
}
