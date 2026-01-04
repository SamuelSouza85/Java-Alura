package Aula05.Desafio.Imprimir;

import Aula05.Desafio.Pessoa;

import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();


        System.out.println("Qual é seu nome: ");
        pessoa.nome = scanner.nextLine();
        System.out.println("Você se indentifica como um homem ou uma mulher: ");
        pessoa.genero = scanner.nextLine();
        pessoa.imprime();


    }
}
