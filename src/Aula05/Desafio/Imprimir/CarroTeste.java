package Aula05.Desafio.Imprimir;

import Aula05.Desafio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "BMW";
        carro.cor = "preto";
        carro.anoDeFabricacao = 2009;

        carro.imprime();
        System.out.println("O carro tem " + carro.idade() + " de idade");
    }
}
