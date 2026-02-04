package OrientaçãoObjetos.Screenmatch;

import OrientaçãoObjetos.Screenmatch.br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import OrientaçãoObjetos.Screenmatch.br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import OrientaçãoObjetos.Screenmatch.br.com.alura.screenmatch.modelos.Episodio;
import OrientaçãoObjetos.Screenmatch.br.com.alura.screenmatch.modelos.Filme;
import OrientaçãoObjetos.Screenmatch.br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();


        System.out.println("******************************");
        System.out.println("Filme");

        System.out.println();

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

        filme.imprime();

        System.out.println("A media do titulo é " + filme.pegaMedia());

        System.out.println();


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setGenero("Fantasia");
        outroFilme.setAnoDeLancamento(2024);
        outroFilme.setDublado(false);
        outroFilme.setDuracaoEmMinutos(180);

        System.out.println("******************************");

        Serie serie = new Serie();

        System.out.println("Serie");

        System.out.println();

        serie.setNome("Dexter");
        serie.setGenero("Investigação");
        serie.setAnoDeLancamento(2006);
        serie.setTemporadas(8);
        serie.setNumeroDeEpisodios(96);
        serie.setMinutosPorEpisodio(50);
        serie.setDublado(true);
        serie.setInclusoNoPlano(true);
        serie.avalia(5);
        serie.avalia(9);
        serie.avalia(8);
        serie.avalia(6);
        serie.avalia(10);

        serie.imprime();

        System.out.println("A media do titulo é " + serie.pegaMedia());


        System.out.println("O Titulo possui " + serie.getTemporadas() + " temporadas");
        System.out.println("O Titulo possui " + serie.getNumeroDeEpisodios() + " episodios");
        System.out.println("O Titulo no total possui: " + serie.getDuracaoEmMinutos() + " minutos");



        System.out.println("******************************");

        System.out.println("Calcular tempo");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);


        System.out.println("******************************");

        System.out.println("Episodio");

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie("Dexter");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


    }
}
