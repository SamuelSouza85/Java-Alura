package ListasColecoes.Aula03;

import ListasColecoes.Aula03.Interface.Forma;

public class Quadrado implements Forma {

    public double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
