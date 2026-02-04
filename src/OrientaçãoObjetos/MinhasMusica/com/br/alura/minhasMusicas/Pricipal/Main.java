package OrientaçãoObjetos.MinhasMusica.com.br.alura.minhasMusicas.Pricipal;

import OrientaçãoObjetos.MinhasMusica.com.br.alura.minhasMusicas.Modelo.MinhasPreferidas;
import OrientaçãoObjetos.MinhasMusica.com.br.alura.minhasMusicas.Modelo.Musica;
import OrientaçãoObjetos.MinhasMusica.com.br.alura.minhasMusicas.Modelo.PodCast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("O mundo é nosso");
        minhaMusica.setAutor("Djonga");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        PodCast meuPodcast = new PodCast();

        meuPodcast.setTitulo("PodPah");
         meuPodcast.setApresentador("Igão");

        for (int i = 0; i < 200; i++) {
            meuPodcast.reproduzir();
        }
        for (int i = 0; i < 100; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
