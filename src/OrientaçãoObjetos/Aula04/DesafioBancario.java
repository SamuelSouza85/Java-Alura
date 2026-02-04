package OrientaçãoObjetos.Aula04;

import java.util.Scanner;

public class DesafioBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Samuel de Souza";
        String conta = "Corrente";
        double saldo = 10000.00;
        int escolha = 0;


        System.out.println("**********************************");
        System.out.println("Dados inicias do Cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo inicial: R$" + saldo );
        System.out.println("**********************************");

        while (escolha != 4){
            System.out.println("Operações");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            escolha = scanner.nextInt();
            if (escolha == 1){
                System.out.println("O seu saldo é de R$" + saldo);
                System.out.println();
            } else if (escolha == 2) {
                System.out.println("Informe o valor a receber: ");
                double receber = scanner.nextInt();
                double novoSaldo = receber + saldo;
                System.out.println("Saldo atualizado R$" +  novoSaldo);
                System.out.println();
            } else if(escolha == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double transferencia = scanner.nextDouble();
                double saldoTransferencia = saldo - transferencia;
                if (saldo < transferencia){
                    System.out.println("Não há saldo suficiente para realizar a transferência");
                    System.out.println();
                }else{
                    System.out.println("Transferência realizada com sucesso e seu saldo agora é de R$" + saldoTransferencia);
                    System.out.println();
                }
            } else if (escolha > 4) {
                System.out.println("Operação Inválida");
                System.out.println();
            }
        }
    }
}
