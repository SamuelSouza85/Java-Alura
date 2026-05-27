package PraticandoVariaveisETipos.Aula1.Domino;

public class Livros {
    public String titulo;
    public String autor;
    public int numeropaginas;
    public double precolivro;

    public Livros(String titulo, String autor, int numeropaginas, double precolivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
        this.precolivro = precolivro;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeropaginas=" + numeropaginas +
                ", precolivro=" + precolivro +
                '}';
    }
}
