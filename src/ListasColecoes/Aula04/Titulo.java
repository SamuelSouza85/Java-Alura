package ListasColecoes.Aula04;

public class Titulo implements Comparable<Titulo>{

    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo segundoTitulo) {
        return this.getNome().compareTo(segundoTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo: " + this.getNome();
    }
}
