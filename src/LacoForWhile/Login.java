package LacoForWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "1243";

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.println("Digite sua senha: ");
            String tentativasenha = scanner.nextLine();

            if (tentativasenha.equals(senha)){
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você tem "+ (tentativas - 1) + " tentativas restantes.");
            }else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
        scanner.close();
    }
}
