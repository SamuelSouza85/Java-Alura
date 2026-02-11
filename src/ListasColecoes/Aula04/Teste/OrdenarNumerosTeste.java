package ListasColecoes.Aula04.Teste;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class OrdenarNumerosTeste {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new LinkedList<>();

        listaNumeros.add(2);
        listaNumeros.add(0);
        listaNumeros.add(6);
        listaNumeros.add(8);
        listaNumeros.add(4);

        System.out.println(listaNumeros);

        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);
    }
}
