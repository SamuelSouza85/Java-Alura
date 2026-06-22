package PraticandoOrientacoesObjetos;

import PraticandoOrientacoesObjetos.Classes.CadastroFuncionario;

import java.util.Scanner;

public class AtualizarCadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroFuncionario funcionario = new CadastroFuncionario();

        System.out.println("Nome do funcionário:");
        funcionario.nome = scanner.nextLine();
        System.out.println("Cargo atual do funcionário:");
        funcionario.cargo = scanner.nextLine();
        System.out.println("Novo cargo do funcionário:");
        String novoCargo = scanner.nextLine();
        System.out.println("Nivel do acesso atual do funcionário:");
        funcionario.nivelAcesso = scanner.nextInt();
        System.out.println("Novo nível de acesso do funcionário:");
        int novoNivel = scanner.nextInt();

        funcionario.atualizarCadastro(novoCargo, novoNivel);
    }
}
