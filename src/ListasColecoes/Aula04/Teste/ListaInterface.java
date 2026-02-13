package ListasColecoes.Aula04.Teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaInterface {
    public static void main(String[] args) {
        List<String> nomesLista;

        nomesLista = new ArrayList<>();

        nomesLista.add("Samuel");
        nomesLista.add("Cleber");

        System.out.println(nomesLista);

        nomesLista = new LinkedList<>();

        nomesLista.add("Leo");
        nomesLista.add("Pietro");

        System.out.println(nomesLista);
    }
}
