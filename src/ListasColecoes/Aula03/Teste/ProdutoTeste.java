package ListasColecoes.Aula03.Teste;

import ListasColecoes.Aula03.Produto;

import java.util.ArrayList;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz 5kg", 20);
        Produto produto2 = new Produto("Chocolate", 10);

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(produto1);
        produtos.add(produto2);

        produtos.forEach(System.out::println);
    }
}
