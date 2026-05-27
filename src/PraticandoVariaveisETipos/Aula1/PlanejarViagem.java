package PraticandoVariaveisETipos.Aula1;

public class PlanejarViagem {
    public static void main(String[] args) {
        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = combustivelAtual * consumoMedio;

        System.out.printf("Autonomia Maxima: %.1f km%n", autonomiaMaxima );
        System.out.printf("Autonomia atual: %.1f km%n", autonomiaAtual);

        if (autonomiaAtual < distanciaViagem){
            System.out.println("Você não conseguirá completar a viagem sem precisar abastecer.");
        } else{
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        }
    }
}
