package Aula03;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = scanner.nextLine();
        System.out.println("E em qual ano ele foi lançado: ");
        int anoDeLancamento = scanner.nextInt();
        System.out.println("E qual nota você dá ao filme:");
        double avaliacao = scanner.nextDouble();


        System.out.println("Que legal seu filme favorito é " + filme + " ele foi lançado em "+ anoDeLancamento + " e sua nota foi " + avaliacao );
    }
}
