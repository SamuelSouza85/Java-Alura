package OrientaçãoObjetos.MinhasMusica.com.br.alura.minhasMusicas.Modelo;

public class Musica extends Audio {

    private String autor;
    private String album;
    private String genero;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClasificacao() {
        if (this.getTotalReproducao() > 2000) {
            return 10;
        }else {
            return 7;
        }
    }
}
