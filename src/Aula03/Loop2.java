package Aula03;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int notaTotal = 0;

        while (nota != -1) {
        System.out.println("E qual nota você dá ao filme ou -1 para encerrar:");
            nota = scanner.nextDouble();


            if (nota != -1) {
                media += nota;
                notaTotal++;
            }
        }

        System.out.println("Média de avaliações: " + media/ notaTotal);

    }
}
