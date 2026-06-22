package PraticandoOrientacoesObjetos;

import PraticandoOrientacoesObjetos.Classes.Aluno;

import java.util.Scanner;

public class CalcularNota {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome: ");
        aluno.nome = scanner.nextLine();
        System.out.println("1° Semestre: ");
        aluno.semestre1 = scanner.nextDouble();
        System.out.println("2° Semestre: ");
        aluno.semestre2 = scanner.nextDouble();

        aluno.exibir();
        scanner.close();
    }
}
