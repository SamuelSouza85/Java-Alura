package LacoForWhile;

import java.util.Scanner;

public class Pulando5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int entrada = scanner.nextInt();

        for (int i = 1; i < entrada; i++) {
                if (i % 10 == 5){
                    continue;
                }
            System.out.print(i + " ");
        }
    }
}
