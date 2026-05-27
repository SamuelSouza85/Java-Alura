package LacoForWhile;

import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual número deseja que seja o final do intervalo: ");
        int escolha = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i <= escolha; i++) {
            if (i % 2 == 0){
                soma += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a "+ escolha + " é: " + soma);
    }
}
