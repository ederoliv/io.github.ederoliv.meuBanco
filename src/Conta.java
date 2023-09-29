import java.util.Objects;

public class Conta {
    Pessoa titular;
    private int numero, agencia;
    private double saldo;

    Conta () {}

        //....

    public Pessoa getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    Conta (Pessoa titular, int numeroConta, int agencia) {
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.numero = numeroConta;
        this.agencia = agencia;
    }
    public void sacar(double valor){

        if(saldo - valor <= 0){

            throw new IllegalArgumentException("Saldo Insuficiente!");

        }else{
            saldo -= valor;
        }

    }


    public void sacar(double valor, double taxaSaque){
        sacar(valor + taxaSaque);
    }


    public void depositar(double valor){

        if(valor <= 0){

            throw new IllegalArgumentException("Valor minimo: 1 real");

        } else {
            saldo += valor;
        }

    }
}