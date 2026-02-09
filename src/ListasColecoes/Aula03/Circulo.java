package ListasColecoes.Aula03;

import ListasColecoes.Aula03.Interface.Forma;

public class Circulo implements Forma {

    public double raio;

    @Override
    public double calcularArea() {
       return  3.16 * (raio * raio);
    }
}
