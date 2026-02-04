package OrientaçãoObjetos.Aula06.Teste;

import OrientaçãoObjetos.Aula06.IdadePessoa;

public class IdadePessoaTeste {
    public static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();

        idadePessoa.setIdade(18);
        idadePessoa.setNome("Samuel");

        idadePessoa.maiorDeIdade();
    }
}
