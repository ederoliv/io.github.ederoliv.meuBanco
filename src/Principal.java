public class Principal {

    public static void main (String[] args){


        Conta conta1 = new Conta();
        Pessoa titular1 = new Pessoa();
        Conta conta2 = new Conta();
        Pessoa titular2 = new Pessoa();

        titular1.nome = "Eder Oliveira";
        titular1.documento = "01920542019";

        titular2.nome = "Davi Oliveira";
        titular2.documento = "02020642120";

        conta1.titular = titular1;
        conta1.agencia = 1;
        conta1.numero = 100;
        conta1.saldo = 15_000;

        conta2.titular = titular2;
        conta2.agencia = 1;
        conta2.numero = 101;
        conta2.saldo = 20_000;

        System.out.println(conta1.titular.nome);
        System.out.println(conta1.saldo);

        System.out.println(conta2.titular.nome);
        System.out.println(conta2.saldo);
    }
}
