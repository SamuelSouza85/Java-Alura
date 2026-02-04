package OrientaçãoObjetos.Aula03.Exercicio;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Se você deseja calcular a área de um quadrado digite 1, se for a area de um circulo digite 2");
        int escolha = scanner.nextInt();
        double ladoQuadrado = 0;
        double raioCirculo = 0;

        if (escolha == 1){
            System.out.println("Quanto mede em cm um lado do seu quadrado");
            ladoQuadrado = scanner.nextDouble();
            double areaQuadrado = ladoQuadrado*ladoQuadrado;
            System.out.println("A área do seu quadrado é de " + areaQuadrado + " cm²");
        } else if (escolha == 2) {
            System.out.println("Quantos cm mede o raio do seu círculo");
            raioCirculo = scanner.nextDouble();
            double areaCirculo = 3.14 * (raioCirculo * raioCirculo);
            System.out.println("A área do seu círculo mede " + areaCirculo + " cm²");
        }else{
            System.out.println("Escolha apenas 1 ou 2");
        }
    }
}
