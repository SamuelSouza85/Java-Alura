package Screenmatch.br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{

    private int temporadas;
    private int numeroDeEpisodios;
    private int minutosPorEpisodio;
    private boolean episodiosEmLancameto;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isEpisodiosEmLancameto() {
        return episodiosEmLancameto;
    }

    public void setEpisodiosEmLancameto(boolean episodiosEmLancameto) {
        this.episodiosEmLancameto = episodiosEmLancameto;
    }


    @Override
    public int getDuracaoEmMinutos() {
        return numeroDeEpisodios * minutosPorEpisodio;
    }
}
