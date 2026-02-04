package OrientaçãoObjetos.Aula03.Exercicio;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual número você quer que seja multiplicado:");
        int tabuada = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            int resultado = tabuada * i;
            System.out.print(tabuada + "X" + i +" = " + resultado+"/ " );
        }
    }
}
