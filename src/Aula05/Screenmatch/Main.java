package Aula05.Screenmatch;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Primitive War";
        filme.genero = "Suspense";
        filme.anoDeLancamento = 2025;
        filme.dublado = false;
        filme.somaDasAvaliacao = 8;
        filme.totalAvaliacoes = filme.totalAvaliacoes;
        filme.duracaoEmMinutos = 135;
        filme.inclusoNoPlano = true;
        filme.avalia(5);
        filme.avalia(4);
        filme.avalia(8);
        filme.avalia(6);
        filme.avalia(10);
        System.out.println(filme.somaDasAvaliacao);
        System.out.println(filme.pegaMedia());

        filme.imprime();


    }
}
