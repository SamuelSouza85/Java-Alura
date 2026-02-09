package ListasColecoes.Aula02.Teste;

import ListasColecoes.Aula02.Produto;

import java.util.ArrayList;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Leite", 4, 50);
        Produto produto2 = new Produto("Ovo", 2, 40);
        Produto produto3 = new Produto("Queijo", 10, 20);


        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println(listaDeProdutos.size());
        System.out.println("Produto na posição 0: " + listaDeProdutos.getFirst().getNome());
        System.out.println(listaDeProdutos.toString());

    }
}
