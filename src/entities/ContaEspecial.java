package entities;

public class ContaEspecial extends Conta{

    private double limite;

    public ContaEspecial(String titular,int numero,  double limite) {
        super(titular, numero);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public boolean sacar(double valor){
        if (valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
}
