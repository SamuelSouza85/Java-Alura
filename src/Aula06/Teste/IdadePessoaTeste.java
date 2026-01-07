package Aula06.Teste;

import Aula06.IdadePessoa;

public class IdadePessoaTeste {
    public static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();

        idadePessoa.setIdade(18);
        idadePessoa.setNome("Samuel");

        idadePessoa.maiorDeIdade();
    }
}
