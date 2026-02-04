package OrientaçãoObjetos.Aula08.Teste;

import OrientaçãoObjetos.Aula08.Livro;
import OrientaçãoObjetos.Aula08.ProdutoFisico;

public class ProdutoTeste {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.calcularPrecoFinal(50);

        ProdutoFisico fisico = new ProdutoFisico();

        fisico.calcularPrecoFinal(80);
    }
}
