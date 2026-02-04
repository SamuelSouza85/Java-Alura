package OrientaçãoObjetos.Aula05.Desafio;

import java.util.Scanner;

public class Calculadora {

    Scanner scanner = new Scanner(System.in);

    public int escolhaOperacao;
    public int numeroEscolhido1;
    public int numeroEscolhido2;
    public double resultado = 0;


    public void imprime() {


        while (escolhaOperacao != 5) {
            System.out.println("Escolha uma das opções:");
            System.out.println("1- Adição");
            System.out.println("2- Subtração");
            System.out.println("3- Divisão");
            System.out.println("4- Multiplicação");
            System.out.println("5- Deseja sair?");

            escolhaOperacao = scanner.nextInt();

            if (escolhaOperacao == 1) {

                System.out.println("Digite o número que irá ser adicionado:");
                numeroEscolhido1 = scanner.nextInt();
                System.out.println("Digite agora digite o número que vai adicionar:");
                numeroEscolhido2 = scanner.nextInt();

                System.out.println();

                resultado = numeroEscolhido1 + numeroEscolhido2;
                System.out.println(numeroEscolhido1 + " + " + numeroEscolhido2 + " = " + resultado);

                System.out.println();

            } else if (escolhaOperacao == 2) {

                System.out.println("Digite o número que irá ser subtraido:");
                numeroEscolhido1 = scanner.nextInt();
                System.out.println("Digite agora digite o número que vai subtrair:");
                numeroEscolhido2 = scanner.nextInt();

                System.out.println();

                resultado = numeroEscolhido1 - numeroEscolhido2;
                System.out.println(numeroEscolhido1 + " - " + numeroEscolhido2 + " = " + resultado);

                System.out.println();
            } else if (escolhaOperacao == 3) {

                System.out.println("Digite o número que irá ser dividido:");
                numeroEscolhido1 = scanner.nextInt();
                System.out.println("Digite agora digite o número que vai dividir:");
                numeroEscolhido2 = scanner.nextInt();

                System.out.println();

                if (numeroEscolhido2 == 0) {
                    System.out.println("Um número não pode ser divido por zero tente outro");

                    System.out.println();
                } else {
                    resultado = (double) numeroEscolhido1 / numeroEscolhido2;
                    System.out.println(numeroEscolhido1 + " / " + numeroEscolhido2 + " = " + resultado);

                    System.out.println();
                }
            } else if (escolhaOperacao == 4) {

                System.out.println("Digite o número que irá ser multiplicado:");
                numeroEscolhido1 = scanner.nextInt();
                System.out.println("Digite agora digite o número que vai multiplicar:");
                numeroEscolhido2 = scanner.nextInt();

                System.out.println();

                resultado = numeroEscolhido1 * numeroEscolhido2;
                System.out.println(numeroEscolhido1 + " X " + numeroEscolhido2 + " = " + resultado);

                System.out.println();

            }else if (escolhaOperacao > 5){
                System.out.println();

                System.out.println("Digite apenas os números das operações");

                System.out.println();
            }else {
                System.out.println("Muito obrigado por utilizar meu programa");
            }
        }
    }
}
