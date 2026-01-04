package Aula05.Desafio.Imprimir;

import Aula05.Desafio.Musica;

public class MusicaTeste {
    public static void main(String[] args) {
        Musica musica = new Musica();

        musica.titulo = "Da ponte pra cá";
        musica.artista = "Racionais";
        musica.anoDeLancamento = 2002;
        musica.avaliar(10);
        musica.avaliar(8);
        musica.avaliar(7);
        musica.avaliar(4);
        musica.avaliar(5);
        musica.imprime();
        System.out.println("A média é de: " + musica.media());
    }
}
