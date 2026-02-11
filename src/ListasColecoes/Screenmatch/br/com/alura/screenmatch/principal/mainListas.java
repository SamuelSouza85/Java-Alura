package ListasColecoes.Screenmatch.br.com.alura.screenmatch.principal;

import ListasColecoes.Screenmatch.br.com.alura.screenmatch.modelos.Filme;
import ListasColecoes.Screenmatch.br.com.alura.screenmatch.modelos.Serie;
import ListasColecoes.Screenmatch.br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class mainListas {
    public static void main(String[] args) {

        Filme filme = new Filme("Primitive War", 2025);

        filme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2024);

        outroFilme.avalia(7);

        var filmeDoSamuel = new Filme("Como Treinar seu Dragão", 2011);

        filmeDoSamuel.avalia(10);

        Serie serie = new Serie("Dexter", 2006);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoSamuel);
        listaDeAssistidos.add(filme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(serie);

        for (Titulo item: listaDeAssistidos) {
            System.out.println(item);
            if (item instanceof Filme filme2 && filme2.getClassificacao() > 2){
                System.out.println("Classificação:" + filme2.getClassificacao());
            }
         }

         List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Cleber");
        buscaPorArtista.add("Samuel");
        buscaPorArtista.add("Fabio");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação" + buscaPorArtista);

        System.out.println("Organizado por ordem alfabetica");

        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        System.out.println("Organizado por ano de lançamento");

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaDeAssistidos);
    }
}
