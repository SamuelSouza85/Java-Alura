package Aula05.Desafio.Imprimir;

import Aula05.Desafio.Aluno;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Samuel";
        aluno.idade = 16;

        aluno.imprime();
    }
}
