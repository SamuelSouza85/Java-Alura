package OrientaçãoObjetos.MinhasMusica.com.br.alura.minhasMusicas.Modelo;

public class Audio {

    private String titulo;
    private int totalReproducao;
    private int curtida;
    private int clasificacao;




    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }


    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getCurtida() {
        return curtida;
    }

    public int getClasificacao() {
        return clasificacao;
    }

    public void curtir(){
        this.curtida++;
    }
    public void reproduzir(){
        this.totalReproducao++;
    }
}
