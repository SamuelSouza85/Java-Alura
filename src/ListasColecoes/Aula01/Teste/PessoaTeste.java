package ListasColecoes.Aula01.Teste;

import ListasColecoes.Aula01.Pessoa;

import java.util.ArrayList;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Samuel", 16 );
        Pessoa pessoa2 = new Pessoa("Cleber", 49);
        Pessoa pessoa3 = new Pessoa("Pietro", 17);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(listaDePessoas.size());

        System.out.println(listaDePessoas.getFirst());
        System.out.println(listaDePessoas);

    }
}