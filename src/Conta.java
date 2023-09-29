public class Conta {
    Pessoa titular;
    int numero, agencia;
    double saldo;

    /*Abaixo o método construtor, ele eh um metodo com o nome exatamente igual da classe e ele eh executado na
    instanncia do objeto*/
    Conta() {

        //...

    }
    public void sacar(double valor){

        if(saldo - valor <= 0){

            throw new IllegalArgumentException("Saldo Insuficiente!");

        }else{
            saldo -= valor;
        }

    }

    /*SOBRECARGA DE METODO EH A TECNICA DE ESCREVER DOIS METODOS COM O MESMO NOME MAS COM A
    * ASSINATURA DIFERENTE
    * EX: TENHO O METODO SAQUE, MAS HA TIPOS DIFERENTES DE SAQUE:
    *  SAQUE
    *  SAQUE + TAXA,
    *  SAQUE MAIS + MULTA,
    *  ETC*/
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