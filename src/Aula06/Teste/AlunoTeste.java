package Aula06.Teste;

import Aula06.Aluno;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Samuel", 8, 9, 10);

        System.out.println("O nome do aluno é " + aluno.getNome());
        System.out.println("A média é " + aluno.calcularMedia());
    }
}
