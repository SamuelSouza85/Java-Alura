package ListasColecoes.Aula03.Teste;

import ListasColecoes.Aula03.Circulo;
import ListasColecoes.Aula03.Interface.Forma;
import ListasColecoes.Aula03.Quadrado;

import java.util.ArrayList;

public class FormasTeste {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();

        quadrado.lado = 5.5;

        Circulo circulo = new Circulo();

        circulo.raio = 6.2;

        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(circulo);
        formas.add(quadrado);

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
