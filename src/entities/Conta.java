package entities;

public class Conta {

    private String titular;
    private int numero;
    protected double saldo = 0;

    public Conta(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double reajuste){
        this.saldo += reajuste;
    }

    public boolean sacar(double valor){
        if (this.getSaldo() >= this.saldo){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
}
