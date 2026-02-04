package OrientaçãoObjetos.Aula06.Teste;

import OrientaçãoObjetos.Aula06.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 40);

        System.out.println("O produto " + produto.getNome());
        System.out.println("Tem o valor de R$" + produto.getPreco());

        produto.aplicaDesconto(10);

        System.out.println("O valor novo fica R$" + produto.getPreco());
    }
}
