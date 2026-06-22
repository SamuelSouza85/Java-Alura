package PraticandoOrientacoesObjetos;

import PraticandoOrientacoesObjetos.Classes.Produto;

import java.util.Scanner;

public class RelatorioProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("nome = ");
        produto.nome = scanner.nextLine();
        System.out.println("preço = ");
        produto.preco = Double.parseDouble(scanner.nextLine().replace(",", "."));
        System.out.println("quantidade = ");
        produto.quantidade = Integer.parseInt(scanner.nextLine());

        produto.exibir();
        scanner.close();
    }
}
