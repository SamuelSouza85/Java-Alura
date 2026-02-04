package OrientaçãoObjetos.Aula06;

public class Livro {

    private String titulo;
    private String nome;

    public Livro(String titulo, String nome) {
        this.titulo = titulo;
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimeDetalhes(){
        System.out.println("O titulo do livro é " + titulo);
        System.out.println("O autor se chama " + nome);
    }
}
