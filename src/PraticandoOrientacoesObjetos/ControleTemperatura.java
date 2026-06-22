package PraticandoOrientacoesObjetos;

import PraticandoOrientacoesObjetos.Classes.Setores;

import java.util.Scanner;

public class ControleTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Setores setores = new Setores();

        System.out.println("Local = ");
        setores.local = scanner.nextLine();
        System.out.println("Temperatura = ");
        setores.temperatura = scanner.nextDouble();

        setores.exibir();
    }
}
