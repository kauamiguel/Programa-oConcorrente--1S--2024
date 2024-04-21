public class Conta {
    Integer saldo;

    public Conta(Integer saldo){
        this.saldo = saldo;
    }

    Integer pegarSaldo(){
        return this.saldo;
    }

    void diminuirSaldo(Integer quantidade){
        this.saldo -= quantidade;
    }

    void aumentarSaldo(Integer quantidade){
        this.saldo += quantidade;
    }
}
