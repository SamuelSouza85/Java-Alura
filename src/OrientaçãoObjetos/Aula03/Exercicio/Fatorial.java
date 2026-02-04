package OrientaçãoObjetos.Aula03.Exercicio;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int fatorial = scanner.nextInt();
        int resultado = 1;

        for (int i = 1; i <= fatorial; i++) {
            resultado = resultado * i;
        }
        System.out.println("O fatorial de 5 é " + resultado);
    }
}
