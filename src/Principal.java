public class Principal {

    public static void main (String[] args){

        Pessoa titular1 = new Pessoa();
        Pessoa titular2 = new Pessoa();

        Conta conta1 = new Conta(titular1, 1, 100);
        Conta conta2 = new Conta(titular2, 1, 101);


        titular1.nome = "Eder Oliveira";
        titular1.documento = "01920542019";

        titular2.nome = "Davi Oliveira";
        titular2.documento = "02020642120";

        conta1.titular = titular1;


        conta1.depositar(15_000);

        conta2.titular = titular2;

        conta2.depositar(20_000);

        conta1.sacar(10_000, 5);
        conta2.sacar(16_000);

        System.out.println(conta1.titular.nome);
        System.out.println(conta1.saldo);

        System.out.println(conta2.titular.nome);
        System.out.println(conta2.saldo);
    }
}
