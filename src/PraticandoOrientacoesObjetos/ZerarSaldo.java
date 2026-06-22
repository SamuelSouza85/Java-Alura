package PraticandoOrientacoesObjetos;

import PraticandoOrientacoesObjetos.Classes.Saldo;

public class ZerarSaldo {
    public static void main(String[] args) {
        Saldo conta = new Saldo();

        conta.saldo = 1800.69;

        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }
}
