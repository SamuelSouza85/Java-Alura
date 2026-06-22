package PraticandoOrientacoesObjetos.Classes;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void exibir(){
        System.out.printf("Produto: %s %n", nome);
        System.out.printf("Preço: %.2f %n", preco );
        System.out.printf("Quantidade em estoque: %d", quantidade);
    }
}
