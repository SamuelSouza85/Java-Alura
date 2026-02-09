package ListasColecoes.Aula03.Teste;


import ListasColecoes.Aula03.ContaBancaria;

import java.util.ArrayList;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria(287, 8039);
        ContaBancaria contaBancaria2 = new ContaBancaria(288, 27739);
        ContaBancaria contaBancaria3 = new ContaBancaria(289, 39);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();

        listaDeContas.add(contaBancaria1);
        listaDeContas.add(contaBancaria2);
        listaDeContas.add(contaBancaria3);

        listaDeContas.forEach(System.out::println);


    }
}
