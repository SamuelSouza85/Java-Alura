package Screenmatch;

import Screenmatch.br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Primitive War");
        filme.setGenero("Suspense");
        filme.setAnoDeLancamento(2025);
        filme.setDublado(false);
        filme.setDuracaoEmMinutos(135);
        filme.setInclusoNoPlano(true);
        filme.avalia(5);
        filme.avalia(4);
        filme.avalia(8);
        filme.avalia(6);
        filme.avalia(10);
        System.out.println(filme.pegaMedia());

        filme.imprime();


    }
}
