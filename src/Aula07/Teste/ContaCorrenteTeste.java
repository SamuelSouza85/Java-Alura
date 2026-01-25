package Aula07.Teste;

import Aula07.ContaBancaria;
import Aula07.SubClasses.ContaCorrente;

public class ContaCorrenteTeste {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.depositar(1000);
        contaBancaria.consultarSaldo();

        System.out.println("-----------------");

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(200);
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(400);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();

    }
}
