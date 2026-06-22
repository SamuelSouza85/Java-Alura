package PraticandoOrientacoesObjetos.Classes;

public class Saldo {

    public double saldo;

    public void exibirSaldo(){
        System.out.printf("Saldo atual: R$%.2f %n", saldo);
    }
    public void zerarSaldo(){
        saldo -= saldo;
    }
}
