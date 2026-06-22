package PraticandoOrientacoesObjetos;

import PraticandoOrientacoesObjetos.Classes.Atraso;

import java.util.Scanner;

public class MultaAtraso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atraso pedido = new Atraso();

        System.out.println("Título do Livro: ");
        pedido.titulo = scanner.nextLine();
        System.out.println("Dias de atraso");
        pedido.diasAtraso = scanner.nextInt();

        pedido.exibirDetalhes();

    }
}
