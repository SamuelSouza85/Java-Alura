package ListasColecoes.Aula03.Teste;

import java.util.ArrayList;

public class ArrayListTeste {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>();

        nome.add("Samuel");
        nome.add("Cleber");
        nome.add("Pietro");
        nome.add("Caio");

        nome.forEach(System.out::println);
    }
}
