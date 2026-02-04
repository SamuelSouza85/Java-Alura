package OrientaçãoObjetos.Aula03.Exercicio;

import java.util.Random;
import java.util.Scanner;

public class Adivinhador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;
                while (tentativas < 5) {
                    System.out.println("Digite um número de 0 a 100:");
                    numeroDigitado = scanner.nextInt();
                    tentativas++;

                    if (numeroDigitado == numeroAleatorio) {
                        System.out.println("Parabéns você acertou em " + tentativas + " tentativas");
                        break;
                    } else if (numeroDigitado < numeroAleatorio) {
                        System.out.println("O número que foi gerado é maior");
                    } else {
                        System.out.println("O número que foi gerado é menor");
                    }
                }

                if (tentativas == 5 && numeroDigitado != numeroAleatorio) {
                    System.out.println("Você tinha 5 tentativas e infelizmente errou em todas. O número gerado era:" + numeroAleatorio);
                }

    }
}
