package OrientaçãoObjetos.Aula07.Teste;

import OrientaçãoObjetos.Aula07.ContaBancaria;
import OrientaçãoObjetos.Aula07.SubClasses.ContaCorrente;

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
