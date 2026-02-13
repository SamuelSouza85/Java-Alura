package ListasColecoes.Compras.br.com.alura.compras;

import ListasColecoes.Compras.br.com.alura.compras.modelos.Compras;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal extends Compras {
    public static void main(String[] args) {


        Compras compras = new Compras();
        Scanner scanner = new Scanner(System.in);
        int escolha = 1;



        System.out.println("Digite o limite do seu cartão:");
        compras.setSaldo(scanner.nextInt());
        System.out.println("Digite a descrição do produto:");
        scanner.nextLine();
        compras.setProduto(scanner.nextLine());
        System.out.println("Digite o valor da compra:");
        compras.setPreco(scanner.nextInt());

        List<String> listaProdutos = new LinkedList<>();


        if (compras.getSaldo() >= compras.getPreco()){
            System.out.println("Compra realizada");
            compras.setSaldo(compras.getSaldo() - compras.getPreco());
        }else{
            System.out.println("Saldo Insuficiente");
        }

        listaProdutos.add(compras.getProduto() + " - " + compras.getPreco());

        while (escolha != 0 &&  compras.getSaldo() > compras.getPreco()){

            System.out.println("Digite 0 para sair ou 1 para continuar");
            escolha = scanner.nextInt();

            if (escolha == 1){
                System.out.println("Digite a descrição do produto:");
                scanner.nextLine();
                compras.setProduto(scanner.nextLine());
                System.out.println("Digite o valor da compra");
                compras.setPreco(scanner.nextInt());

                listaProdutos.add(compras.getProduto() + " - " + compras.getPreco());

                if (compras.getSaldo() >= compras.getPreco()){
                    System.out.println("Compra realizada");
                    compras.setSaldo(compras.getSaldo() - compras.getPreco());
                }else{
                    System.out.println("Saldo Insuficiente");
                }
            }

        }

        System.out.println("*************************************");

        System.out.println("Compras realizadas: ");

        System.out.println();


        System.out.println(listaProdutos);

        System.out.println();

        System.out.println("*************************************");
        System.out.println("Saldo Final: R$" + compras.getSaldo());
    }
}
