package PraticandoOrientacoesObjetos.Classes;

public class Livro {
    public String titulo;
    public String autor;
    public int pagina;

    public  void exibir(){
        System.out.printf("\"%s\" de %s com %d", titulo, autor, pagina);
    }
}
