public class Loja {
    Conta conta;
    Banco banco;
    Funcionario primeiroFuncionario;
    Funcionario segundoFuncionario;

    public Loja(Conta conta){
        this.conta = new Conta();
        this.banco = new Banco();
    }

    void pagarFuncionario(Conta remetente, Conta destinatario){
        
    }
}
