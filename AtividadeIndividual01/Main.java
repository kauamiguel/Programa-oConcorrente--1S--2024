/*
 * Nome : Kauã Miguel Costa Matos
 * Matrícula : UC22101679
 * Programação concorrente e distribuida Segunda Feira ,  1 - Semestre 2024
 * 
 */

public class main {
    public static void main(String[] args) {

        // Main only have objects instances and the start of threads
        Bank bank = new Bank();

        Store store1 = new Store(bank, "Store1");
        Store store2 = new Store(bank, "Store2");
        
        Client client1 = new Client(bank, store1, store2, "Client 1");
        Client client2 = new Client(bank, store1, store2, "Client 2");
        Client client3 = new Client(bank, store1, store2, "Client 3");
        Client client4 = new Client(bank, store1, store2, "Client 4");
        Client client5 = new Client(bank, store1, store2, "Client 5");


        client1.start();
        client2.start();
        client3.start();
        client4.start();
        client5.start();
        try {
            client1.join();
            client2.join();
            client3.join();
            client4.join();
            client5.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //Check final balance of each client
        System.out.println("Saldo final dos clientes: ");
        System.out.println("Saldo do " + client1.name + ": " + client1.account.getBalance());
        System.out.println("Saldo do " + client2.name + ": " + client2.account.getBalance());
        System.out.println("Saldo do " + client3.name + ": " + client3.account.getBalance());
        System.out.println("Saldo do " + client4.name + ": " + client5.account.getBalance());
        System.out.println("Saldo do " + client4.name + ": " + client5.account.getBalance());
        System.out.println("");
        System.out.println("Saldo final das lojas: ");
        System.out.println("Saldo da loja " + store1.storeName + " : " + store1.account.getBalance());
        System.out.println("Saldo da loja " + store2.storeName + " : " + store2.account.getBalance());
        System.out.println("");
        System.out.println("Saldo final das dos funcionarios: ");
        System.out.println("Saldo do primeiro funcionario da loja 1: " + store1.firstEmployee.accountSalary.getBalance());
        System.out.println("Saldo do segundo funcionario da loja 1: " + store1.secondEmployee.accountSalary.getBalance());
        System.out.println("Saldo do primeiro funcionario da loja 1: " + store2.firstEmployee.accountSalary.getBalance());
        System.out.println("Saldo do segundo funcionario da loja 1: " + store2.secondEmployee.accountSalary.getBalance());
        System.out.println("");
        System.out.println("Saldo final conta de investimento dos funcionarios: ");
        System.out.println("Saldo de investimento do primeiro funcionario da loja 1: " + store1.firstEmployee.accountInvestment.getBalance());
        System.out.println("Saldo de investimento do segundo funcionario da loja 1: " + store1.secondEmployee.accountInvestment.getBalance());
        System.out.println("Saldo de investimento do primeiro funcionario da loja 1: " + store2.firstEmployee.accountInvestment.getBalance());
        System.out.println("Saldo de investimento do segundo funcionario da loja 1: " + store2.secondEmployee.accountInvestment.getBalance());
    }
}
