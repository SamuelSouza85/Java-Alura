package LacoForWhile;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int escolha = scanner.nextInt();
        int soma = 1;

        for (int i = 1; i <= escolha; i++) {
            soma *= i;
        }
        System.out.println("O fatorial de "+ escolha + " é : " + soma);
    }
}
