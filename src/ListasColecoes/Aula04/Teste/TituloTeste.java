package ListasColecoes.Aula04.Teste;

import ListasColecoes.Aula04.Titulo;

import java.util.LinkedList;
import java.util.List;

public class TituloTeste {
    public static void main(String[] args) {

        Titulo titulo1 = new Titulo("Como treinar seu Dragão");
        Titulo titulo2 = new Titulo("Planeta dos Macacos");
        Titulo titulo3 = new Titulo("Até o ultimo homem");
        Titulo titulo4 = new Titulo("Homens de Honra");
        Titulo titulo5 = new Titulo("As branquelas");


        List<Titulo> listaTitulos = new LinkedList<>();

        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo4);
        listaTitulos.add(titulo5);

        listaTitulos.sort(Titulo::compareTo);
        System.out.println(listaTitulos);
    }
}
