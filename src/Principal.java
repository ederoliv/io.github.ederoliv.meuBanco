public class Principal {

    public static void main(String[] args){

        Pessoa eu =  new Pessoa();
        Pessoa voce = new Pessoa();

        Conta minhaConta = new Conta();
        Conta suaConta = new Conta();

        minhaConta.titular = eu;

        minhaConta.saldo = 1_000;
        minhaConta.titular.nome = "Eder";

        suaConta.titular = voce;
        suaConta.titular.nome = "Davi";

        minhaConta.depositar(-2);

        System.out.println("Saldo: " + minhaConta.saldo);

    }
}