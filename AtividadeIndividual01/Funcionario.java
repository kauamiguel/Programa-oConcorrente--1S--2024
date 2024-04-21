public class Funcionario extends Thread{
    Conta contaSalario;
    Conta contaInvestimento;
    Banco banco;

    public Funcionario(Conta contaSalario, Conta contaInvestimento){
        this.contaInvestimento = contaInvestimento;
        this.contaSalario = contaSalario;
        this.banco = new Banco();
    }
}
