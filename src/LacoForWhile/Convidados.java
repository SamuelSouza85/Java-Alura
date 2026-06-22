package LacoForWhile;

import java.util.ArrayList;
import java.util.Scanner;

public class Convidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();

        while (true){
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar)");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")){
                System.out.println("Programa finalizado.");
                break;
            }

            if (nome.equalsIgnoreCase("ver")){
                System.out.println("Lista de convidados:" + convidados);
            }

            boolean jaExiste = false;
            for (String convidado : convidados){
                if (convidado.toLowerCase().equals(nome.toLowerCase())){
                    jaExiste = true;
                    break;
                }
            }
            if (jaExiste){
                System.out.println("O nome " + nome+ " já existe");
            }else{
                convidados.add(nome);
                System.out.println(nome + " foi adicionado à lista de convidados.");
            }
        }

        scanner.close();

    }
}
