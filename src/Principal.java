public class Principal {

    public static void main(String[] args){


        Pessoa eu =  new Pessoa();
        Pessoa voce = new Pessoa();

        Conta minhaConta = new Conta(eu, 1234, 111);
        Conta suaConta = new Conta();


        minhaConta.depositar(1);

        System.out.println("Saldo: " + minhaConta.getSaldo());


    }
}