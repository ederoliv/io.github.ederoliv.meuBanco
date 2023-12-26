package io.github.ederoliv.meuBanco.app;

import io.github.ederoliv.meuBanco.modelo.Conta;
import io.github.ederoliv.meuBanco.modelo.Pessoa;

public class Principal {

    public static void main (String[] args){

        Pessoa titular1 = new Pessoa();
        Pessoa titular2 = new Pessoa();

        Conta conta1 = new Conta(titular1, 1, 100);
        Conta conta2 = new Conta(titular2, 1, 101);


        titular1.setNome("Eder Oliveira");
        titular1.setDocumento("01920542019");

        titular2.setNome("Davi Oliveira");
        titular2.setDocumento("02020642120");

        conta1.depositar(15_000);

        conta2.depositar(20_000);

        conta1.sacar(10_000, 5);
        conta2.sacar(16_000);

        System.out.println(conta1.getTitular().getNome());
        System.out.println(conta1.getSaldo());

        System.out.println(conta2.getTitular().getNome());
        System.out.println(conta2.getSaldo());
    }
}
