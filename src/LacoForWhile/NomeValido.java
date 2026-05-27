package LacoForWhile;

import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Digite seu nome: ");
            name = scanner.nextLine();
            if (name.length() < 3) {
                System.out.println("Nome inválido. Digite novamente.");
            }
        } while (name.length() < 3);
        System.out.println("Nome \"" + name + "\" cadastrado com sucesso!");
        scanner.close();
    }
}
