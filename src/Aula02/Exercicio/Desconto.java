package Aula02.Exercicio;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 805.5;
        double percentualDesconto = precoOriginal * 0.10;
        double valorDesconto = precoOriginal - percentualDesconto;

        System.out.println("O produto custava R$" + precoOriginal + ", mas com o desconto de 10% ele fica no valor de R$" + valorDesconto );
    }
}
