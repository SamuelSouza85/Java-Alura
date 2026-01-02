package Aula03.Exercicio;

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite um numero: ");
        int n2 = scanner.nextInt();

        if (n2 == n1){
            System.out.println("Eles são números iguais");
        }else{
            System.out.println("Eles são números diferetes");
            if (n1 > n2){
                System.out.println("O primeiro número é maior que o segundo");
            }else{
                System.out.println("O segundo número é maior que o primeiro");
            }
        }
    }
}
