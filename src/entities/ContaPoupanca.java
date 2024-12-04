package entities;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String titular, int numero) {
        super(titular, numero);
    }

    public void reajustar(double percentual){
        saldo += percentual;
    }
}
