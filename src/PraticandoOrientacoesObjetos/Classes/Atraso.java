package PraticandoOrientacoesObjetos.Classes;

public class Atraso {
    public String titulo;
    public int diasAtraso;

    double calcularMulta(){
        return diasAtraso * 2.50;
    }

    public void exibirDetalhes(){
        double multa = calcularMulta();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f%n", titulo, diasAtraso, multa);
    }
}
